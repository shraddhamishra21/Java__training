package lect17;

import java.util.LinkedHashSet;

public class linkhashset {
    static void main(String[] args) {

        LinkedHashSet <Integer> link=new LinkedHashSet<>() ;
        link.add(50);
        link.add(10);
        link.add(20);
        link.add(30);
        IO.println(link);
    }
}
