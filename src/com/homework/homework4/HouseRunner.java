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
        House house = getHouse();
        printAllInformation(house);
    }

    private static House getHouse() {
        Room[] singleRoomApt = {new Room(true)};
        Room[] doubleRoomsApt = {new Room(false), new Room(true)};
        Room[] threeRoomsApt = {new Room(true), new Room(true), new Room(false)};

        Apartment[] apartments1 = {new Apartment(1, singleRoomApt), new Apartment(2, doubleRoomsApt), new Apartment(3, threeRoomsApt)};
        Apartment[] apartments2 = {new Apartment(4, singleRoomApt), new Apartment(5, doubleRoomsApt), new Apartment(6, threeRoomsApt)};
        Apartment[] apartments3 = {new Apartment(7, singleRoomApt), new Apartment(8, doubleRoomsApt), new Apartment(9, threeRoomsApt)};
        Floor[] floors = {new Floor(1, apartments1), new Floor(2, apartments2), new Floor(3, apartments3)};
        House house = new House(10, floors);
        return house;
    }

    private static void printAllInformation(House house) {
        house.print();
        for (Floor floor : house.getFloor()) {
            floor.print();
            for (Apartment apartment : floor.getApartment()) {
                apartment.print();
                for (Room room : apartment.getRoom()) {
                    room.print();
                }
            }
        }

    }
}
