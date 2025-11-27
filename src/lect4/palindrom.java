package lect4;

public class palindrom {
    public static void main(String[] args) {
        String s1="amma";
        String s2="";
        int len=s1.length();
        for(int i=len-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        boolean result=(s1.equals(s2));
        if(result){
            System.out.println("yes");}
        else{
            System.out.println("no");
        }

    }
}

