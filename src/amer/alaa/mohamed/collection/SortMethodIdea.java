package amer.alaa.mohamed.collection;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;

public class SortMethodIdea {
    /*
     * دالة ال sort تستخدم علشان تعدل علي ال object من خلال انك هتباصي ال
     * reference  تبع هذا ال object
     * */
    public static class Man {
        private String name;
        private String address;

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }
    }

    //    انت هتروح تقارن الكلاس person بنفسه بواسطة interface  اللي اسمها comparable
    public static class Person implements Comparable<Person> {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name);
        }
        // Here we need to make a function to sort the elements in the arraylist
        // and returns the middle element

    }

    public static Person getPersonInTheMiddle(ArrayList<Person> persons){
        Collections.sort(persons);
      int index= persons.size() / 2;
        return persons.get(index);
    }


    public static void modifyingObjectValues(Man man, String newName) {
        man.name = newName;
    }

    public static void main(String[] args) {
        Man man = new Man("Mohamed Alaa amer ", "Cairo , Egypt ");
        System.out.println(man.name);

        // we will call the ModifyingFunction
        modifyingObjectValues(man, "Mostafa Amer ");
        System.out.println(man.name);
        System.out.println(man.address);

        System.out.println(man.name);
        System.out.println(man.address);


        ArrayList<Person> persons = new ArrayList<>();
        Person p = new Person("Ali");
        persons.add(p);
        p.setName("Fady");
        persons.add(p);
        persons.add(new Person("Salma")); // You could not modify This value
        persons.add(new Person("Ola")); // You could not modify This value because you will not be catch it by any reference
        persons.add(new Person("Ali")); // You could not modify This value because you will not be catch it by any reference
        System.out.println("====== BEFORE SORTING =========");
        for (Person ele : persons) {
            System.out.println(ele.name);
        }
        System.out.println("=========== AFTER SORTING ===========");
        Collections.sort(persons);
        for (Person ele : persons) {
            System.out.println(ele.name);
        }

        //This is just simple methods to sort and returns the middle Element of the ArrayList<persons>
        ArrayList<Person> newPersons=new ArrayList<>();
        newPersons.add(new Person("wharer"));
        newPersons.add(new Person("foudn"));
        newPersons.add(new Person("moohaahamed"));
        newPersons.add(new Person("Adddddddel"));
    Person middlePerson =  getPersonInTheMiddle(newPersons);
        System.out.println(middlePerson.name);
    }
    /*
     * iهي دي فكرة عمل ال sort()
     * الموجودة عندنا في ال Collections  كلاس
     * هنعدل علي قيمة ال object من خلال انك هتباصي ال reference  للدالة
     *
     * */

}
