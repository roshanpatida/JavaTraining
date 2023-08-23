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

class Movie {

    String name;
    String result;

    Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

class ConumerChaining {

    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");

        Consumer<Movie> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);

        Consumer<Movie> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");

        Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);

        Movie m1 = new Movie("Bahubali", "Hit");
        chainedC.accept(m1);

        Movie m2 = new Movie("Spider", "Flop");
        chainedC.accept(m2);
    }
}
