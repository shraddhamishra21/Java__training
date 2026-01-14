package lect14;

import java.util.*;

public class linklist {
    static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        l.add(9);
        l.add(5);
        l1.add(10);
        l1.add(90);

        //  IO.println(l.get(3));
        //l.set(0,78);
        l.addAll(l1);
         l.removeLast() ;
        l.removeFirst();
      IO.println(l);

//        IO.println(l.size() );
//        IO.println( l.contains(54));
//        IO.println( l.indexOf(10) );
//        IO.println( l.lastIndexOf(9) );
//        l.addLast(98);-+
//        l.addFirst(2);
      //  IO.println(l.reversed() );
//        for (int i = l.size() - 1; i >= 0; i--) {
//            IO.print(l.get(i)+" ");
//
//        }
    }
}



