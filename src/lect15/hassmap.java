package lect15;

import java.util.*;

public class hassmap {
    static void main(String[] args) {
        HashMap <Integer ,Integer > map=new HashMap<>();
        map.put(1,90);
        IO.println(map);
        IO.println(map.get(1));
        map.getOrDefault(2,20);
        IO.println(map.get(2));

    }
}
