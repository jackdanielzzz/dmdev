package com.homework.homework11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class CsvHelper {

    private CsvHelper() {
    }

    public static Map<Integer, Double> getMapFromCsv(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            return lines
                    .skip(1)
                    .map(it -> it.split(","))
                    .collect(Collectors.toMap(it -> Integer.parseInt(it[0]), it -> Double.valueOf(it[1])));
        }
    }

    public static List<Item> getObjectFromCsv(Path namePath) throws IOException {
        try (Stream<String> lines = Files.lines(namePath, StandardCharsets.UTF_8)) {
            return lines
                    .skip(1)
                    .map(it -> it.split(","))
                    .map(it -> new Item(Integer.parseInt(it[0]), it[1], 0.0))
                    .toList();
        }
    }

    public static List<String> toListRepresentation(List<Item> items) {
        return items.stream()
                .map(it -> it.getId() + "," + it.getName() + "," + it.getPrice())
                .collect(Collectors.toList());
    }
}
