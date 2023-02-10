package org.example;

import javax.swing.plaf.IconUIResource;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubstringwithConcatenationofAllWords {
    public ArrayList<Integer> solution (String s, String[] words){
        if (s == null || words == null || s.length() == 0 || words.length == 0){
            return new ArrayList<>;
        }
        HashMap<String, Integer> counts = new HashMap<>();
        for (String word: words){
            counts.put(word, counts.getOrDefault(words,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= s.length() - words.length* words[0].length(); i++){
            String sub = s.substring(i, i + words.length*words[0].length());
            if (isConcat(sub, counts, words[0].length())){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isConcat (String sub, HashMap<String, Integer> counts, int jump){
        HashMap <String, Integer> seen = new HashMap<>();
        for (int i = 0; i <= sub.length() - jump; i += jump){
            String piece = sub.substring(i,i +jump);
            seen.put(piece, seen.getOrDefault(seen, 0)+1);
            if (seen.get(piece) > counts.get(piece)) {
                return false;
            }
        }
        return true;
    }
}
