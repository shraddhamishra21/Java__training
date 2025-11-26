package lect2;

public class sumofarray {
    public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    int sum=0;
    int n=5;
    int i=0;
    while(n>i){
        sum =sum+a[i];
        i++;
    }
    System.out.println("sum is equal:"+sum);

}
}


