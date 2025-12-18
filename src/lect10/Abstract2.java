package lect10;

abstract class shape{
    abstract   void area();
}

class circle extends shape{
    void area(){
        IO.println("circle");
    }
}
class rectangle extends shape{
    void area(){
        IO.println("rectangle");
    }
}


public class Abstract2 {
    static void main(String[] args) {
        circle c=new circle();
        c.area() ;





    }
}



