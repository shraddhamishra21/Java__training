package lect15;

import java .util.*;

public class pairsum {
        static void main(String[] args) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int a[] = {2, 4, 2, 7, 5,2};
            int target=5;
            for (int i=0;i<a.length;i++) {
                int diff=target-a[i];
        if (map.containsKey(diff) ) {
            IO.println(map.get(diff)+" "+i);
            break;
        }
           map.put(a[i],i);
            }

          //  IO.println();
        }

}
