package lect15;

import java.util.*;

public class frequency {
    static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {2, 4, 2, 7, 5,2};
        for (int x : a) {
            map.put(x,map.getOrDefault(x,0)+1);


        }
        IO.println(map);
    }
}