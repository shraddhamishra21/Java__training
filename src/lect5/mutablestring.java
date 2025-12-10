package lect5;

public class mutablestring {
    public static void main() {
        StringBuilder s =new StringBuilder("hello");
        System.out.println(s.delete(2,4));
        System.out.println(s.append("java") );
    }
}
