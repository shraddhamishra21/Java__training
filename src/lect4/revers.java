package lect4;

public class revers {
    public static void main(String[] args) {
        String s1="shraddha";
        String s2="";
        IO.println(s1);
        int len=s1.length();
        for(int i=len-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        IO.println(s2);

    }
}

