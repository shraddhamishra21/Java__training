package lect16;

public class recursion5 {

   static int fab(int n){
       if(n==0){
           return 0;
       }
       
       return fab(n-1)+fab(n-2);

    }
    static void main(String[] args) {
      IO.println(  fab(5));
    }
}