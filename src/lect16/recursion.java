package lect16;

public class recursion{
    public static  void Num(int n){
        if(n==0)
            return ;

        IO.println(n);
        Num(n-1);
    }
    static void main(String[] args) {
        Num(5);
    }


}
