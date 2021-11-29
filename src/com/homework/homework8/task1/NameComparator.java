package com.homework.homework8.task1;

import java.util.Comparator;

public class NameComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
