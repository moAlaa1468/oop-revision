package amer.alaa.mohamed.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstCollection {
    //What is the iterable you could iterate over this class Not using Normal For loop
    // انت هتلف علي جميع عناصر ال arrayList ولكن باستخدام ال For المختصرة
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("mohamed");
        names.add("Alaa");
        names.add("mostafa");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //مثال علي ال for  المختصرة
        // This is the enhanced For
        for (String element : names) {
            System.out.println(element);
        }
        //That mean that The ArrayList class extends Iterable Class

        // Any Thing iterable could be used with anyThing iterable or Implements Iterable Interface
        int[] numbers = new int[3];
        for (int number : numbers) {
            System.out.println(number);
        }

        //Any Collection is Iterable because it Extend the Iterable class
        //Iterable<E> interface contains the basic methods that any Collection must implement [blueprint] and all Collections implements Iterable>E>
        //According to your senario You will use the appropriate Collection type ==> Important
        //Simple hint anyThing hashed Couldn't be repeated ===> duplication is not allowed
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(25);
        hashSet.add(23);
        hashSet.add(23); // THis value will be rejected because duplication is not allowed
        // But HashSet implements the Iterator Class so it has its own method to loop on all elements on it
        for (Integer number : hashSet){
            System.out.println(number);
        }

        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("Amer");
        hashSet1.add("Aly");
        hashSet1.add("samir");
        hashSet1.add("Yara");
        hashSet1.add("Alaa");
        hashSet1.add("What");

        for (String element : hashSet1){
            System.out.println(element);
        }

    }
}
