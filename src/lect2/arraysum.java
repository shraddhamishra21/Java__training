package lect2;

public class arraysum {
    public static void main(){
        int[] a={1,2,3,4,5};
        int i=0;
       int  sum=0;
        while(i<5){
            sum=sum+a[i];
            i++;
        }
        System.out.println(sum);

}

}
