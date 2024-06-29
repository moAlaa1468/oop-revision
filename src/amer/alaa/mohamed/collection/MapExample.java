package amer.alaa.mohamed.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    //Map is not Iterable uaAmer
//there are some interfaces under Map and some classes like abstractMap
//you have hashTable and hashMap they implements the Map interface
//compare between hashMap and hashTable in java
// This is the reference type
    public static void usingHashMap() {
//        Set<String> set; //this is just interface you could not take object from it
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
        Set<Map.Entry<String,String>> result= map.entrySet();
        //
    }


    public static void main(String[] args) {
        usingHashMap();
    }


}
