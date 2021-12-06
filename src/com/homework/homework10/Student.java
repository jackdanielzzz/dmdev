package com.homework.homework10;

import java.util.List;

public record Student(String firstName, String lastName, int yearAtUniversity,
                      List<Integer> marks) {

    public double getAverageMark() {
        return marks.stream().mapToDouble(value -> value).average().orElse(0);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
