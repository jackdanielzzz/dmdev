package com.homework.homework4;

/**
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах,
 * квартирах и комнатах, вызывая методы print.
 */
public class HouseRunner {

    public static void main(String[] args) {
        printAllInformation(getHouse1());
    }

    static House getHouse1() {
        Room[] rooms1 = {new Room(true), new Room(false)};
        Apartment[] apartments1 = {new Apartment(1, rooms1)};

        Room[] rooms2 = {new Room(false), new Room(false), new Room(false)};
        Room[] rooms3 = {new Room(true), new Room(true), new Room(false)};
        Apartment[] apartments2 = {new Apartment(2, rooms2), new Apartment(3, rooms3)};

        Floor[] floors = {new Floor(1, apartments1), new Floor(2, apartments2)};
        return new House(2, floors);

    }

    private static House getHouse2() {
        Room[] singleRoomApt1 = {new Room(true)};
        Room[] doubleRoomsApt2 = {new Room(false), new Room(true)};
        Room[] threeRoomsApt3 = {new Room(true), new Room(true), new Room(false)};
        Room[] singleRoomApt4 = {new Room(true)};
        Room[] doubleRoomsApt5 = {new Room(false), new Room(true)};
        Room[] threeRoomsApt6 = {new Room(true), new Room(true), new Room(false)};
        Room[] singleRoomApt7 = {new Room(true)};
        Room[] doubleRoomsApt8 = {new Room(false), new Room(true)};
        Room[] threeRoomsApt9 = {new Room(true), new Room(true), new Room(false)};

        Apartment[] apartments1 = {new Apartment(1, singleRoomApt1), new Apartment(2, doubleRoomsApt2), new Apartment(3, threeRoomsApt3)};
        Apartment[] apartments2 = {new Apartment(4, singleRoomApt4), new Apartment(5, doubleRoomsApt5), new Apartment(6, threeRoomsApt6)};
        Apartment[] apartments3 = {new Apartment(7, singleRoomApt7), new Apartment(8, doubleRoomsApt8), new Apartment(9, threeRoomsApt9)};
        Floor[] floors = {new Floor(1, apartments1), new Floor(2, apartments2), new Floor(3, apartments3)};
        return new House(10, floors);
    }

    private static void printAllInformation(House house) {
        house.print();
        for (Floor floor : house.getFloors()) {
            floor.print();
            for (Apartment apartment : floor.getApartments()) {
                apartment.print();
                for (Room room : apartment.getRooms()) {
                    room.print();
                }
            }
        }

    }
}
