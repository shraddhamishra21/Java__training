package lect9;

public class methodoverloading2 {

    void area(double r){
        IO.println("The area of circle is"+3.14*r*r);
    }
    void area(int l,int b){
        IO.println("The area of the rect is"+l*b);
    }
    void area(int l){
        IO.println("Area of squar="+l*l);
    }

    static void main(String[] args) {
        methodoverloading2 m=new methodoverloading2();
        m.area(10);
        m.area(4,9);
        m.area(10);
    }
}
