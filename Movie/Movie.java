package com.mycompany.finaltesting;

public class Movie {

    private String title;
    private double hours;
    private int grade;

    public Movie(String title, double hours, int grade) {
        if (title == null) {
            this.title = "No Title";
        } else {
            this.title = title;
        }

        if (hours <= 0.0) {
            this.hours = 2.0;
        } else {
            this.hours = hours;
        }

        if (grade < 1 || grade > 5) {
            this.grade = 3;
        } else {
            this.grade = grade;
        }
    }

    public String getTitle() {
        return title;
    }

    public double getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", hours=" + hours + ", grade=" + grade + '}';
    }

    public boolean equalMoive(Movie m) {
        return this.title.equals(m.title) && m.hours == this.hours && m.grade == this.grade;
    }

    public int compareTo(Movie m) {
        if (this.grade < m.grade || m.title == null ) {
            return 1;
        } else if (this.grade > m.grade) {
            return -1;
        } else if (this.grade == m.grade) {
            return 0;
        }
        return 99;
    }
}
