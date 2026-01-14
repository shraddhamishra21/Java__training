package lect16;

public class recursion1 {

 public static  void Num(int n){
        if(n==0)
            return ;
        Num(n-1);
        IO.println(n);

    }
    static void main(String[] args) {
         Num(5);
    }

}

