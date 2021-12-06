package com.homework.homework10;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * 1 - Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * 2 - Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * 3 - Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", 1, List.of(4, 5, 3, 4, 2, 2, 1)),
                new Student("Petr", "Petrov", 2, List.of(5, 4)),
                new Student("Sidor", "Sidorov", 3, List.of(2, 3, 4, 5, 4, 3, 2, 3)),
                new Student("Tihon", "Tihonov", 2, List.of(1, 2, 3, 3, 4, 2, 3, 4, 3)),
                new Student("Rostislav", "Rostislavovich", 1, List.of(4, 5, 3, 4, 2, 2, 1)),
                new Student("Georg", "Georgievich", 2, List.of(3, 2)),
                new Student("Mitya", "Mityaev", 3, List.of(2, 3, 3)),
                new Student("Kostya", "Kostyaev", 2, List.of(1, 2, 3, 4, 4, 2, 3, 1, 3)),
                new Student("Olga", "Vasilievna", 5, List.of(5, 5, 5, 5)),
                new Student("Maria", "Dmitrievna", 5, List.of(3, 3, 3, 3))
        );

        Map<Integer, Double> yearAndAverageMark = students.stream()
                .filter(student -> student.marks().stream().mapToInt(Integer::intValue).count() > 3)
                .collect(groupingBy(Student::yearAtUniversity, averagingDouble(Student::getAverageMark)));

        System.out.println("Средняя оценка по каждому курсу: " + yearAndAverageMark);

        Map<Integer, List<String>> yearAndFullName = students.stream()
                .sorted(comparing(Student::getFullName))
                .collect(groupingBy(Student::yearAtUniversity, mapping(Student::getFullName, toList())));

        System.out.println("Список студентов по каждому курсу: " + yearAndFullName);

        Map<Integer, AverageMarkAndStudents> studentsMap = students.stream()
                .sorted(comparing(Student::getFullName))
                .collect(groupingBy(Student::yearAtUniversity, collectingAndThen(toList(), list -> {
                            Set<String> studentFullName = list.stream()
                                    .map(Student::getFullName)
                                    .collect(toSet());
                            Double averageMark = list.stream()
                                    .collect(averagingDouble(Student::getAverageMark));
                            return new AverageMarkAndStudents(averageMark, studentFullName);
                        }
                )));

        System.out.println("Студенты и их средний балл: " + studentsMap);
    }
}
