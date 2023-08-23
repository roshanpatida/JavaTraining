/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section8_consumer;

/**
 *
 * @author roshan_patidar
 */
import java.util.function.*;
import java.util.*;

class Movie {

    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

class MovieExample {

    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<Movie>();
        populate(l);
        Consumer<Movie> c = m -> {
            System.out.println("Movie Name:" + m.name);
            System.out.println("Movie Hero:" + m.hero);
            System.out.println("Movie Heroine:" + m.heroine);
            System.out.println();
        };
        for (Movie m : l) {
            c.accept(m);
        }

    }

    public static void populate(ArrayList<Movie> l) {
        l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        l.add(new Movie("Rayees", "Sharukh", "Sunny"));
        l.add(new Movie("Dangal", "Ameer", "Ritu"));
        l.add(new Movie("Sultan", "Salman", "Anushka"));
    }

}
