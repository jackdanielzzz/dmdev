package com.homework.homework8.task1;

import java.util.Objects;

/**
 * 1. Дан список чатов. Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает,
 * то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 * <p>
 * 2. Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей
 */
public class Chat implements Comparable<Chat> {

    private String name;
    private Integer usersCount;

    public Chat(String name, Integer usersCount) {
        this.name = name;
        this.usersCount = usersCount;
    }

    public String getName() {
        return name;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    @Override
    public String toString() {
        return "Chat{" + "name='" + name + '\'' + ", usersCount=" + usersCount + '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.getName().compareTo(o.getName());
    }
}