package com.homework.homework9;

/**
 * 1. Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе
 */
public class CinemaRunner {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(1, 1999, 10, "Боевик", 9.0));
        cinema.addMovie(new Movie(2, 1999, 5, "Драмма", 6.0));
        cinema.addMovie(new Movie(2, 2001, 5, "Драмма", 6.0));
        cinema.addMovie(new Movie(3, 2002, 7, "Ужасы", 5.0));
        cinema.addMovie(new Movie(4, 2003, 6, "Вестерн", 9.5));
        cinema.addMovie(new Movie(5, 2004, 3, "Детектив", 4.2));
        cinema.addMovie(new Movie(7, 2005, 10, "Комедия", 7.5));
        cinema.addMovie(new Movie(8, 2006, 1, "Мелодрама", 8.1));

        System.out.println("Выводим все драммы");
        System.out.println(cinema.getMoviesByGenre("Драмма"));
        System.out.println();

        System.out.println("Выводим все фильмы 1999го года выпуска");
        System.out.println(cinema.getMoviesByYear(1999));
        System.out.println();

        System.out.println("Выводим все фильмы 2002го года и 7го месяца");
        System.out.println(cinema.getMoviesByYearAndMonth(7, 2002));
        System.out.println();

        System.out.println("Выводим все топ 10 фильмов по рейтингам");
        System.out.println(cinema.getTop10Movies());
    }
}
