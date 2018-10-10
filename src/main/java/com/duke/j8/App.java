package com.duke.j8;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 8 Playground!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Java 8 Playground!" );
        classicSort();
    }

    private static void classicSort() {
    }

    private static List<People> getPeople() {
        List<People> people = new ArrayList<People>();
        people.add(new People("Anon", 12));
        people.add(new People("Ralph", 43));
        people.add(new People("David", 34));
        people.add(new People("Sarah", 25));
        people.add(new People("Johan", 31));
        return people;
    }
}
