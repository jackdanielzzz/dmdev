package com.homework.homework8.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class ChatExtendedUtils {

    private static final int ADULT_AGE = 18;

    private ChatExtendedUtils() {
    }

    public static List<User> adultChatFilter(List<ChatExtended> chatList){
        List<User> result = new ArrayList<>();
        for (ChatExtended chatExtended : chatList) {
            for (int i = 0; i < chatExtended.getUsers().size(); i++) {
                User user = chatExtended.getUsers().get(i);
                if (user.getAge() > ADULT_AGE) {
                    result.add(user);
                }
            }
        }
        return result;
    }

    public static double getAverageAge(List<User> adultUserList) {
        ListIterator<User> iterator = adultUserList.listIterator();
        double averageAge = 0.0;
        while (iterator.hasNext()) {
            User nextValue = iterator.next();
            averageAge += nextValue.getAge();
        }
        return averageAge / adultUserList.size();
    }
}
