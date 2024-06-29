package amer.alaa.mohamed.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

    public static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public Person(String name) {
            this.name = name;
        }
    }

    // I need to make function to sort the ArrayList of Person by names
    public static ArrayList<Person> sortingPersonsByNames(ArrayList<Person> personList) {
        //You need to convert the ArrayList to List
        personList.sort(Comparator.comparing(Person::getName));
        return personList;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mohamed");
        names.add("Ali");
        names.add("Ebrahim");
        names.add("potter");

        Collections.sort(names);
        System.out.println(names);
        System.out.println("====================================");

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("moahemd"));
        personList.add(new Person("Samir Samir "));
        personList.add(new Person("Potter Amer "));
        personList.add(new Person("Salah Mohamed"));
        personList.add(new Person("What Bout YYou "));
        personList.add(new Person("Ali  "));

        ArrayList<Person> result = sortingPersonsByNames(personList);
        // we neeed to make a loop on this result to print it out
        for (Person element : result) {
            System.out.println(element.getName());
        }

    }
}
