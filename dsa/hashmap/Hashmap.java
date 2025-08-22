package dsa.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {

    public static void main(String[] args) {
        HashSet <String> fruits = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();

        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("grapes");
        fruits.add("chiku");
        fruits.add("apple");

        // System.out.println(fruits.size());

        // for(String fu : fruits){
        //     System.out.println(fu);
        // }

        boolean appleContains = fruits.contains("apple");
        // System.out.println(appleContains);

        map.put(1, "tushar");
        map.put(2, "abhi");
        map.put(3,"kunal");

        System.out.println( map.get(1));

        map.containsKey(1);

        for(Integer i:map.keySet()){
            System.out.println(i);
        }

        for(String str:map.values()){
            System.out.println(str);
        }



    }
}