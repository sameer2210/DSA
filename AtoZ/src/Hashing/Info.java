package Hashing;

import java.util.*;

public class Info {

    public static void main(String args[]) {
//-------------------------------------------------------------HashMap----------------------
        // store information in (keys, values) pair, o/p = not in order , o(1),

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("india", 10);
//        map.put("china", 20);
//        map.put("uk", 30);
//        map.put("uk", 30);          //same take only one time

//        System.out.println(map);
//        int n = map.get("india");
//        System.out.println("india get method n is "+ n);

//        //containsKey //return true or false
//        boolean con = map.containsKey("indore");   //false
//        System.out.println(con);

//        //remove
//        map.remove("uk");
//        System.out.println(map);
//        System.out.println(map.size());

        //Iterate on map (set)
//        Set<String> keys = map.keySet();
//        System.out.println(keys);
//        for(String k: keys){
//            String ans = k.concat("+ab");
//            System.out.println(ans);
//        }

//--------------------------------------------------------------------LinkedHashMap----------------
            //give o/p - accroding to insertion order (in order) everyting same, o(1)

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("india", 10);
        map.put("china", 20);
        map.put("uk", 30);


        System.out.println(map);
        int ans = map.get("india");
        System.out.println(ans);            //10

//---------------------------------------------------------------------------TreeMap----------
        //apply shorting accroding to keys(keys order) , o(logn), red black tree
//
//        TreeMap<String, Integer> tm = new TreeMap<>();
//
//        tm.put("india", 10);
//        tm.put("china", 20);
//        tm.put("uk", 30);
//
//        System.out.println(tm);
    }

}

