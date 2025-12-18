package lect10;

abstract class bank{
 abstract   void display();
}

class acc extends bank{
    void display(){
        IO.println("hii");
    }
}


public class Abstraction1 {
    static void main(String[] args) {
        acc a=new acc();
        a.display();




    }
}
