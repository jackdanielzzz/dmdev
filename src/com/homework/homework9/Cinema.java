package com.homework.homework9;

import java.util.*;

public class Cinema {

    private Map<Integer, HashSet<Movie>> filmCollectionsByYear = new HashMap<>();

    public void addMovie(Movie movie) {
        if (movie == null) {
            return;
        }

        boolean needAdd = true;
        for (Map.Entry<Integer, HashSet<Movie>> setEntry : filmCollectionsByYear.entrySet()) {
            if (setEntry.getKey().equals(movie.getYear())) {
                HashSet<Movie> movies = setEntry.getValue();
                movies.add(movie);
                needAdd = false;
            }
        }

        if (needAdd) {
            filmCollectionsByYear.put(movie.getYear(), new HashSet<>(Set.of(movie)));
        }
    }

    public HashSet<Movie> getMoviesByYear(Integer year) {
        return filmCollectionsByYear.get(year);
    }

    public Set<Movie> getMoviesByYearAndMonth(Integer year, Integer month) {
        Set<Movie> moviesByYear = filmCollectionsByYear.get(year);
        Set<Movie> result = new LinkedHashSet<>();
        if (moviesByYear != null) {
            for (Movie movie : moviesByYear) {
                if (movie.getMonth().equals(month)) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public Set<Movie> getMoviesByGenre(String genre) {
        Set<Movie> result = new HashSet<>();
        for (Set<Movie> filmList : filmCollectionsByYear.values()) {
            for (Movie movie : filmList) {
                if (movie.getGenre().equals(genre)) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public List<Movie> getTop10Movies() {
        List<Movie> allFilms = new ArrayList<>();
        for (Set<Movie> filmList : filmCollectionsByYear.values()) {
            allFilms.addAll(filmList);
        }
        allFilms.sort(new CinemaRatingComparator());
        return allFilms;
    }

    @Override
    public String toString() {
        return "Cinema{" + "filmCollectionsByYear=" + filmCollectionsByYear + '}';
    }
}
