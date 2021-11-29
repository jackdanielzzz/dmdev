package com.homework.homework8.task2;

import java.util.ArrayList;
import java.util.List;

import static com.homework.homework8.task2.ChatExtendedUtils.adultChatFilter;
import static com.homework.homework8.task2.ChatExtendedUtils.getAverageAge;

/**
 * 2. Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей
 */
public class ChatExtendedRunner {

    public static void main(String[] args) {
        List<User> userList1 = new ArrayList<>(List.of(new User(1, "userList1 юзер1", 21), new User(2, "userList1 юзер2", 22), new User(3, "userList1 юзер3", 23), new User(4, "userList1 юзер4", 24), new User(5, "userList1 юзер5", 25), new User(6, "userList1 юзер6", 16), new User(7, "userList1 юзер7", 17), new User(8, "userList1 юзер8", 18), new User(9, "userList1 юзер9", 19)));
        List<User> userList2 = new ArrayList<>(List.of(new User(1, "userList2 юзер1", 21), new User(2, "userList2 юзер2", 22), new User(3, "userList2 юзер3", 23), new User(4, "userList2 юзер4", 24), new User(5, "userList2 юзер5", 25), new User(6, "userList2 юзер6", 16), new User(7, "userList2 юзер7", 17), new User(8, "userList2 юзер8", 18), new User(9, "userList2 юзер9", 19)));
        List<User> userList3 = new ArrayList<>(List.of(new User(1, "userList3 юзер1", 21), new User(2, "userList3 юзер2", 22), new User(3, "userList3 юзер3", 23), new User(4, "userList3 юзер4", 24), new User(5, "userList3 юзер5", 25), new User(6, "userList3 юзер6", 16), new User(8, "userList3 юзер8", 18), new User(9, "userList3 юзер9", 19)));
        List<User> userList4 = new ArrayList<>(List.of(new User(1, "userList4 юзер1", 21), new User(2, "userList4 юзер2", 22), new User(3, "userList4 юзер3", 23), new User(4, "userList4 юзер4", 24), new User(5, "userList4 юзер5", 25), new User(6, "userList4 юзер6", 16), new User(7, "userList4 юзер7", 17), new User(8, "userList4 юзер8", 18)));

        ChatExtended chatExtended1 = new ChatExtended("Чат номер 1", userList1);
        ChatExtended chatExtended2 = new ChatExtended("Чат номер 2", userList2);
        ChatExtended chatExtended3 = new ChatExtended("Чат номер 3", userList3);
        ChatExtended chatExtended4 = new ChatExtended("Чат номер 4", userList4);

        List<ChatExtended> chatList = new ArrayList<>(List.of(chatExtended1, chatExtended2, chatExtended3, chatExtended4));

        List<User> adultUserList = adultChatFilter(chatList);
        System.out.println(adultUserList);

        double averageAge = getAverageAge(adultUserList);
        System.out.println("Средний возраст: " + averageAge);
    }
}
