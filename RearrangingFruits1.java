package org.example;

import java.util.HashMap;

public class RearrangingFruits1 {
    public int solution (int [] basket1, int[] basket2){
        HashMap<Integer,Integer> initialGroups = new HashMap<>();
        int min = Integer.MAX_VALUE ;
        for (int price: basket1){
            initialGroups.put(price, initialGroups.getOrDefault(price, 0 )+1);
            min = Math.min(price, min);
        }
        for (int price: basket2){
            initialGroups.put(price, initialGroups.getOrDefault(price,0)-1);
            min = Math.min(min,price);
        }
        int replace = 0;
        for (Integer key: initialGroups.keySet()){
            if (initialGroups.get(key) %2 != 0){
                return -1;
            }
            replace += Math.max(0, initialGroups.get(key)/2);
        }
        int ans = 0;
        int canTake = 0;
        for (Integer key: initialGroups.keySet()){
            canTake = Math.min(replace)
        }
    }
}
