package amer.alaa.mohamed.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collectionTask {
    //This is Just the first way to remove Duplicates
    //This is the best solution uaAlaa remove duplicated elements from ArrayList
    public static HashSet<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (Integer number : numbers) {
            hashSet.add(number);
        }
        return hashSet;
    }

    //This is the second Way to remove Duplicated Values
    //You could make make another solution with HahSet
    public static ArrayList<Integer> removeDuplicatesWithHashSet(ArrayList<Integer> numbers) {
//        HashSet<Integer> hashSet=new HashSet<>();
//       hashSet.addAll(numbers);
//       return new ArrayList<>(hashSet);

        //This is the most enhanced code to remove the duplicates From the list
        return new ArrayList<>(new HashSet<>(numbers));
    }


    //This is the Third Way to remove duplicated values
    //What is you must not use hashSet
    public static void removingDuplicatedValuesUsingForLoop() {
        // Create an ArrayList with duplicate values
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("banana");

        System.out.println("Original ArrayList: " + listWithDuplicates);

        // Remove duplicates using a for loop
        for (int i = 0; i < listWithDuplicates.size(); i++) {
            for (int j = i + 1; j < listWithDuplicates.size(); j++) {
                if (listWithDuplicates.get(i).equals(listWithDuplicates.get(j))) {
                    listWithDuplicates.remove(j);
                    j--; // Decrement j to recheck the current index
                }
            }
        }

        System.out.println("ArrayList without duplicates: " + listWithDuplicates);

    }

    //This is the fourth Way to remove by  Iterator Class
    //Hint you could make reference from Interface or abstract Class But not objects
    /*
     ==============  Very Important uaAlaa =============
    خلي بالك انت ينفع تخلي الدالة ترجع object ينفع يتشال في reference من نوع ال parent بتاعه
    function could return object[Like Circle | Triangle] That could be stored in a reference of Parent Type [like Shape]
    * */

    //This the most important part
    public static void removeUsingIteratorInterface(ArrayList<Integer> numbers) {
        // here you will recieve the output of the iterator() function in a reference From Iterator Type
        //Hint the Iterator is the parent of all  Collection Elements
        //This is the way that would be used all over our coming code
        Iterator uniqueNumbers = numbers.iterator();
        while (uniqueNumbers.hasNext()) {
            Integer number = (Integer) uniqueNumbers.next();
            System.out.println(number);
        }
//        return uniqueNumbers;
    }


    public static void main(String[] args) {

        removingDuplicatedValuesUsingForLoop();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(23);
        numbers.add(22);
        numbers.add(21);
        numbers.add(21220);
        System.out.println("-----------------------");
        removeUsingIteratorInterface(numbers);
        System.out.println("---------------------------------");
//        HashSet<Integer> result=removeDuplicates(numbers);
//        System.out.println("The values without duplications");
//        for(Integer number:result){
//            System.out.println(number);
//        }

        ArrayList<Integer> output = removeDuplicatesWithHashSet(numbers);
        for (Integer element : output) {
            System.out.println(element);
        }

    }
}
