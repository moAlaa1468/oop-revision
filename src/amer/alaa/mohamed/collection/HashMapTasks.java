package amer.alaa.mohamed.collection;

import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {

    public static void sortingHashMapWithValue() {
        HashMap<String, Double> phoneNumbers = new HashMap<>();
        phoneNumbers.put("mohamed ", 111111d);
        phoneNumbers.put("adel ", 22222d);
        phoneNumbers.put("mostafa ", 333333d);
        phoneNumbers.put("Samir", 44444d);
        for (Map.Entry<String, Double> entry : phoneNumbers.entrySet()) {
            String first = entry.getKey();

        }
    }


    public static void removeDuplicates(HashMap<String, Integer> map) {
        // Create a set to track seen values
        HashSet<Integer> seenValues = new HashSet<>();

        // Use an iterator to remove entries with duplicate values
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println(seenValues.add(entry.getValue()));
            if (!seenValues.add(entry.getValue())) {
                iterator.remove(); // Remove entry if value is already in the set
            }
        }
    }


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 12334);
        map.put("Banana", 20);
        map.put("Cherry", 221);  // Duplicate value
        map.put("Date", 30);
        map.put("Elderberry", 56);  // Duplicate value
        map.put("Elderberry", 20);  // Duplicate value
        map.put("Elderberry", 99);  // Duplicate value
        map.put("Elderberry", 11);  // Duplicate value
        map.put("Elderberry", 34);  // Duplicate value

        Iterator<Map.Entry<String, Integer>> alaaIterator = map.entrySet().iterator();
        // You need to create new HashSet to add some values to it
        HashSet<Integer> hashSet = new HashSet<>();

        // we need to add some values to this map
//        Map.Entry<String, Integer> entry = alaaIterator.next();
//        hashSet.add(entry.getValue());
//        Map.Entry<String, Integer> entry1 = alaaIterator.next();
//        hashSet.add(entry1.getValue());
//        Map.Entry<String, Integer> entry2 = alaaIterator.next();
//        hashSet.add(entry2.getValue());
//        Map.Entry<String, Integer> entry3 = alaaIterator.next();
//        hashSet.add(entry3.getValue());
//        Map.Entry<String, Integer> entry4 = alaaIterator.next();
//        hashSet.add(entry4.getValue());
        //Adding values using while loop
        while(alaaIterator.hasNext()){
            hashSet.add(alaaIterator.next().getValue());
        }


        //we need to print all values in the alaaIterator
        // Why you to do not make loop on this one
        /*  خلي بالك علشاان تضيف اي شئ لل map or set هتحتاج انك تستخدم ال Iterator
         * we need to print the values of hashSet
         * 1- create the iterator
         * 2- use function in iterator
         * 3- use while loop
         * 4- you may use the hasNext() and next() methods
         * fالقاعدة الاهم عندنا في ال set انها لا تسمح باضافة القيم المكررة
         *
         * */
    Iterator<Integer>  integerValues=  hashSet.iterator();
        while(integerValues.hasNext()){
            System.out.println(integerValues.next());
        }





//        removeDuplicates(map);
    }
}
