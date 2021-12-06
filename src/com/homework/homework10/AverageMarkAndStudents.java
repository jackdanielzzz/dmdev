package com.homework.homework10;

import java.util.Set;

public record AverageMarkAndStudents(
        double averageMark,
        Set<String> studentList
) {
}