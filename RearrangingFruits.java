package org.example;

import java.util.TreeMap;

public class RearrangingFruits {
    public int solution (int [] basket1, int[] basket2){
        TreeMap<Integer,Integer> dif = new TreeMap<>();
        int min = Integer.MAX_VALUE;
        for (int price: basket1){
            dif.put(price, dif.getOrDefault(price,0) +1);
            min = Math.min(min,price);
        }
        for (int price: basket2){
            dif.put(price, dif.getOrDefault(price, 0) -1);
            min = Math.min(min,price);
        }
        int replace = 0;
        for (int i: dif.keySet()) {
            if (dif.get(i) % 2 != 0) {
                return -1;
            }
            replace += Math.max(0, dif.get(i)/2);
        }
        int cantake = 0;
        int ans = 0;
        for (int i: dif.keySet()){
            cantake = Math.min(replace,Math.abs(dif.get(i))/2);
            ans += cantake * Math.min(2*min, i);
            replace -= cantake;
        }

    }
}
