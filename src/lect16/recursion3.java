package lect16;

public class recursion3 {
    static int  i=1;
    public static  void Num(int n){

        if(i==11)
            return ;

        IO.println(n+"*"+i+"="+n*i);
        i++;
        Num(n);
      //  i++;
    }
    static void main(String[] args) {
        Num(5);
    }


}


