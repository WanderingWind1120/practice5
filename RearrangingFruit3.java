package org.example;

import java.util.HashMap;

public class RearrangingFruit3 {
    public int solution (int[] basket1, int[] basket2){
        HashMap<Integer, Integer> dif = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int key: basket1){
            dif.put(key, dif.getOrDefault(key, 0)+1);
            min = Math.min(min, key);
        }
        for (int key: basket2){
            dif.put(key, dif.getOrDefault(key,0)-1);
            min = Math.min(min, key);
        }
        int replace = 0;
        for (int key: dif.keySet()){
            if(dif.get(key) != 0){
                return -1;
            }
            replace += Math.max(0, dif.get(key)/2);

        }
        int cantake = 0;
        int ans =0;
        for (int key: dif.keySet()){
            cantake = Math.min(replace,Math.abs(dif.get(key)));
            ans += cantake* Math.min(2*min, key);
            replace -= cantake;
        }
        return ans;


    }
}
