package lect16;

public class recursion2 {
    static int fact=1;
    public static  void Num(int n){
        if(n==0)
            return ;

        //IO.println(n);
        fact=fact*n;
        Num(n-1);
    }
    static void main(String[] args) {
        Num(4);
        IO.println(fact);
    }


}

