package lect16;

public class recursion4 {
static int sum ;
    public static  int Num(int n){
        if(n==0)
            return 0;

      // IO.println(n);
      //  sum=sum+n;
      return   Num((n-1)*n);
    }
    static void main(String[] args) {
        Num(10);
        IO.println(Num(5));
    }


}


