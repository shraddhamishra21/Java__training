package lect1;
import java.util.*;
public class positive_negetive {

        public static void main() {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt() ;
            IO.println("Enter the no:");
            if(n==0)
                System.out.println("Zero");
            else if(n>0)
                System.out.println("Positive");
            else
                IO.println("Negetive");


    }
}
