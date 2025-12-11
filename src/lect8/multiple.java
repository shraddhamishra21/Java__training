package lect8;


class parant{
    void display(){
        IO.println("hii");
    }
}

class child1 extends parant{

}
class child2 extends parant{

}

public class multiple {
    static void main(String[] args) {


        child1 c1 = new child1();
        child2 c2 = new child2();
        c1.display();
        c2.display();
    }
}
