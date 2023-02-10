package org.example;

import java.util.HashSet;

public class NameaCompany1 {
    public int solution (String [] ideas){
        HashSet<String>[] initialGroups = new HashSet[26];
        for (int i = 0; i<= 25; i++){
            initialGroups[i] = new HashSet<>();
        }
        for (String idea: ideas){
            initialGroups[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        int ans = 0;
        for (int i = 0; i<= 24; i++){
            int numOfMutuals = 0;
            for (int j = i+1; j<= 25; j++){
                for (String suffix: initialGroups[i]){
                    if(initialGroups[j].contains(suffix)){
                        numOfMutuals++;
                    }
                }
                ans += 2* (initialGroups[i].size() - numOfMutuals) * (initialGroups[j].size() - numOfMutuals);
            }
        }
        return ans;
    }
}
