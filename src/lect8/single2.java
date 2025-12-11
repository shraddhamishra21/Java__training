package lect8;

class shape{

    void displayarea() {


        IO.println("circle ");

    }
}

class circle extends shape{
    void Area(double r) {
      IO.println("Area of circle is="+3.14*r*r);

    }
}




public class single2 {
   public static void main(String[] args) {
       circle c=new circle ();

       c.displayarea();
       c.Area(10.00);


    }
}




