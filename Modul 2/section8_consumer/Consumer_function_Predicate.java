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

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Consumer_function_Predicate {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);
        Predicate<Student> p = s -> s.marks >= 60;
        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Dictinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };
        Consumer<Student> c = s -> {
            System.out.println("Student Name:" + s.name);
            System.out.println("Student Marks:" + s.marks);
            System.out.println("Student Grade:" + f.apply(s));
            System.out.println();
        };
        for (Student s : l) {
            if (p.test(s)) {
                c.accept(s);
            }
        }
    }

    public static void populate(ArrayList<Student> l) {
        l.add(new Student("Sunny", 100));
        l.add(new Student("Bunny", 65));
        l.add(new Student("Chinny", 55));
        l.add(new Student("Vinny", 45));
        l.add(new Student("Pinny", 25));
    }
}
