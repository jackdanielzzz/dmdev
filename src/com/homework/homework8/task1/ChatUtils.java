package com.homework.homework8.task1;

import java.util.Iterator;
import java.util.List;

public final class ChatUtils {

    private ChatUtils() {
    }

    public static void removeChatsIfLess(List<Chat> chats, int value) {
        Iterator<Chat> iterator = chats.listIterator();
        while (iterator.hasNext()) {
            Chat nextValue = iterator.next();
            if (nextValue.getUsersCount() < value) {
                iterator.remove();
            }
        }
    }

    public static void printChats(List<Chat> chats) {
        for (Chat chat : chats) {
            System.out.println(chat);
        }
        System.out.println();
    }

}
