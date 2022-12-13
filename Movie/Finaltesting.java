package com.mycompany.finaltesting;

public class Finaltesting {

    public static void main(String[] args) {
        testMovie();
        System.out.println("--------");
        testMovieList();
    }

    public static void testMovie() {
        Movie m1 = new Movie("Spiderman", 2.4, 1);
        Movie m2 = new Movie("Avengers", 3.0, 8);

        System.out.println("is m1 equal to m2: " + m1.equalMoive(m2));
        System.out.println("is m1 equal to m2: " + m2.equalMoive(m1));
        System.out.println("m1 compare to m2: " + m1.compareTo(m2));
        System.out.println("m2 compare to m1: " + m2.compareTo(m2));
    }

    public static void testMovieList() {
        MovieList ml = new MovieList(2);
        ml.addMovie("Doctor Strange", 1.92, 3);
        ml.addMovie("Iron Man", 2.1, 1);
        System.out.println("is Available?: " + ml.isAvailable());
        System.out.println("can resize?: " + ml.resize(3));
        System.out.println("is Available?: " + ml.isAvailable());
        System.out.println("get movie at 2: " + ml.getMovieAt(1));
        System.out.println("search movie 'Iron Man': " + ml.searchForMovieTitle("Iron Man"));
    }
}
