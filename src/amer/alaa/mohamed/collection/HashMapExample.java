package amer.alaa.mohamed.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    //Map is not Iterable uaAmer
//there are some interfaces under Map and some classes like abstractMap
//you have hashTable and hashMap they implements the Map interface
//compare between hashMap and hashTable in java
// This is the reference type
    public static void usingHashMap() {
//        Set<String> set; //this is just interface you could not take object from it
        // Maps are used to control the key instead of index that is used in array
        //  الفكرة هنا انك هتتحكم في ال key مش اكتر وكل سيناريو وليه الاستخدامات تبعه
        HashMap<String, String> amer = new HashMap<String, String>();
        amer.put("firstElement", "value 1");
        amer.put("secondtElement", "value 2");
        amer.put("thrirdtElement", "value 3");

        HashMap<String, String> alaa = new HashMap<>();
        alaa.putAll(amer);

        //If you want to iterate over the Alaa map uaamer
        for (String key : alaa.keySet()) {
            System.out.println("The key is : " + key + " The value of this key is : " + alaa.get(key));
        }

        System.out.println(alaa);
        System.out.println(alaa.isEmpty());


        HashMap<String, String> map = new HashMap<>();
        map.put("Mohamed", "33745");
        map.put("potter", "76986");
        map.put("Ali", "436");
        map.put("Ali", "78");
        map.put("Ali", "898");
        map.put("Ali", "33");
        System.out.println(map.size());
        System.out.println(map.remove("Mohamed", "mohamed"));
//        System.out.println(map.remove("Ali"));
        System.out.println(map.values()); // This doesn't allow duplications uaAlaa
        //This is used to iterator over the map uaAlaa
        for (String key : map.keySet()) {
            System.out.println("the key is : " + key + " The value of this key is : " + map.get(key));
        }

        // The start of the set
//        {
//            {String, String}, //This is the first element ==> This field is Entry
//            {String , String }, // This is the second element ==> This field is Entry
//            {String , String } // This is the third element ==> This field is Entry
//        }
        //This is the end of the set
        //خلي بالك ان ال Entry عبارة عن interface  بداخل ال interface اللي اسمهاMap
        //علشان كدا انت بتعمل Entry.Map
        // كانك عامل inner class and Outer Class
        for (Map.Entry<String,String> entry: map.entrySet()){
           String key=  entry.getKey();
           String value= entry.getValue();
            System.out.println("The key is : "+key + "The value is : "+ value);
        }

    }


    // we need to make a function to sort the hash map with value and create another function to
    //sort it with key ===> Simple Task uaAmer

    public static void main(String[] args) {
        usingHashMap();
    }


}
