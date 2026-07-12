package Hashing;


import java.util.HashMap;
import java.util.Map;

public class Que {


    public static void main (String args[]){

//------------------------------------------------------Count frequency of each element in the array
//    int []arr = {1,2,3,4,5,6,7,8,1,3,5,8,0};
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for(int num : arr){
//        map.put(num, map.getOrDefault(num, 0)+1);
//    }
//    for(int key: map.keySet()){
//        System.out.println(key + " - " + map.get(key));


//------------------------------------------------------------- Frequency of the Most Frequent Element (lc-1838)
//        int []arr = {1,2,3,4,5,6,7,7,7,8,1,3,5,8,8};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int num: arr){
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//        int maxval = Integer.MIN_VALUE;
//        int minval = Integer.MAX_VALUE;
//        int maxElement = -1;
//        int minElement = -1;
//
//        for (Map.Entry<Integer, Integer> key: map.entrySet()){
//
//            int element = key.getKey();
//            int freq = key.getValue();
//
//            if(freq > maxval){
//                maxval = freq;
//                maxElement = element;
//            }
//            if(freq < minval){
//                minval = freq;
//                minElement = element;
//            }
//
//        }
//        System.out.println("max element = " + maxElement + " and freq = "+ maxval);
//        System.out.println("min element = " + minElement + " and freq "+ minval);


//------------------------------------------------------------------------valid anagram(abc = cba)

        String s = "abcde";
        String t = "edcba";

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch , hm.get(ch) - 1);
                }
            }else{
                System.out.println("not");
            }
            System.out.println(hm.isEmpty());

        }




    }
}