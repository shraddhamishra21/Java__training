package lect7;




class Circle{
    double r;
    double area;
    double cir;
   void Area(double r){
       area=3.14*r*r;
       IO.println("Area of circle is:"+area);

   }
   void circumferenc(double r){
       cir=2*3.14*r;
       IO.println("Circumferenc of circle is:"+cir);
   }
}

public class Class6 {
    static void main() {
        Circle C=new Circle();
     //   Circle A=new Circle ();
        C.Area(10);
        C.circumferenc(10);
    }
}
