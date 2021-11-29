package com.homework.homework8.task2;

import java.util.List;

public class ChatExtended {

    private String name;
    private List<User> users;

    public ChatExtended(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    @Override
    public String toString() {
        return "ChatExtended{" + "name='" + name + '\'' + ", users=" + users + '}';
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }
}
