package lect14;

import java.util.*;

public class arraylist {
    static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l.add(9);
        l.add(5);
        l1.add(10);
        l1.add(90);

        //  IO.println(l.get(3));
        //l.set(0,78);

        l.addAll(l1);
        //  l.remove(2) ;
//        IO.println(l);
//        IO.println(l.size() );
//        IO.println( l.contains(54));
//      //  l.replaceAll(l);
//        IO.println( l.indexOf(10) );
//        IO.println( l.lastIndexOf(9) );
        // IO.println(l1);
        for (int i = 0; i < l.size(); i++) {
            IO.println(l.get(i));

        }
    }
}
