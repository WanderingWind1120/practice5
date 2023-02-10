package org.example;

import java.util.HashMap;

public class RearrangingFruit2 {
    public int solution (int [] basket1, int[] basket2){
        HashMap<Integer, Integer> dif = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= basket1.length-1; i++){
            dif.put(basket1[1], dif.getOrDefault(basket1[i], 0)+1);
            min = Math.min(min, basket1[i]);
        }
        for (int i = 0; i <= basket2.length; i++){
            dif.put(basket2[i], dif.getOrDefault(basket2[i],0)-1);
            min = Math.min(basket2[i],min);
        }
        int replace = 0;
        for (int key: dif.keySet()){
            if(dif.get(key) != 0){
                return -1;
            }
            replace += Math.max(0, dif.get(key)/2);
        }
        int canTake = 0;
        int ans = 0;
        for (int key: dif.keySet()){
            canTake = Math.min(replace, Math.abs(dif.get(key)));
            ans += canTake * (Math.min(2*min, key));
            replace -= canTake;
        }
        return ans;
    }
}
