package com.mycompany.finaltesting;

import java.util.Arrays;

public class MovieList {

    private Movie[] movies;
    private int numberOfStories;

    public MovieList(int capacity) {
        if (capacity <= 0) {
            movies = new Movie[10];
        }
        movies = new Movie[capacity];
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public boolean isAvailable() {
        return numberOfStories < movies.length;
    }

    public boolean addMovie(String title, double hours, int grade) {
        if (isAvailable()) {
            movies[numberOfStories++] = new Movie(title, hours, grade);
            return true;
        }
        return false;

    }

    public Movie getMovieAt(int slot) {
        if (slot > 0 && slot <= numberOfStories) {
            return movies[slot];
        }
        return null;
    }

    public boolean resize(int newSize) {
        if (newSize <= numberOfStories) {
            return false;
        }
        Movie[] temp = new Movie[movies.length + newSize];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        movies = temp;
        return true;
    }

    public Movie searchForMovieTitle(String title) {
        if (title == null) {
            return null;
        }
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] == null) {
                continue;
            }
            if (movies[i].getTitle().equals(title)) {
                return movies[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MovieList{" + "movies=" + Arrays.toString(movies) + ", numberOfStories=" + numberOfStories + '}';
    }

}
