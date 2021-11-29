package com.homework.homework8.task1;

import java.util.*;

/**
 * 1. Дан список чатов. Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает,
 * то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatRunner {

    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>(List.of(
                new Chat("Вчат1", 1100),
                new Chat("Ачат2", 1100),
                new Chat("чат3", 1777),
                new Chat("Ячат4", 1100),
                new Chat("чат5", 999),
                new Chat("чат6", 777),
                new Chat("Пчат7", 1100),
                new Chat("чат8", 1500),
                new Chat("чат9", 1001)
        ));

        System.out.println("Сортировка по умолчанию(по названию чата):");
        Collections.sort(chats);
        ChatUtils.printChats(chats);

        System.out.println("Удаляем чаты в которых меньше тысячи человек");
        ChatUtils.removeChatsIfLess(chats, 1000);
        ChatUtils.printChats(chats);

        System.out.println("Сортировка по убыванию количества человек в чате:");
        chats.sort(new InvertedUsersCountComparator());
        ChatUtils.printChats(chats);

        System.out.println("Сортировка по имени с помощью компаратора:");
        chats.sort(new NameComparator());
        ChatUtils.printChats(chats);
    }
}
