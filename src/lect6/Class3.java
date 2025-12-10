package lect6;

class Area{
    int l;
    int b;
    int p;
    int a;
    void peri(int l,int b){
        int p=2*(l+b);
        System.out.println(p);
    }
    void area(int l,int b){
        int a=l*b;
        System.out.println(a);
    }
}
 public class Class3 {
   public static void main(String[] args) {
        Area A = new Area();
     //   Area P = new Area();
        A.area(5, 5);
        A.peri(5, 5);
    }
}


