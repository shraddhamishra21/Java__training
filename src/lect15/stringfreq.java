package lect15;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;

public class stringfreq {
    static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        // int a[] = {2, 4, 2, 7, 5,2};
        String s = "shraddha ";
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(s, 0) + 1);


        }
        IO.println(map);
        for (char ch : s.toCharArray()) {
            if ( map.get( ch)==1){

                IO.println(ch);
                break;
            }
        }

    }
}
