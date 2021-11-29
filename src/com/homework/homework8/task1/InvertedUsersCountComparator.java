package com.homework.homework8.task1;

import java.util.Comparator;

public class InvertedUsersCountComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getUsersCount().compareTo(o2.getUsersCount()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return -Integer.compare(o1.getUsersCount(), o2.getUsersCount());
    }
}
