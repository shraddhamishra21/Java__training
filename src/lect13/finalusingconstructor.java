package lect13;


class cons{
   final int val=10;
    cons(){
        IO.println("Oopss!! its a final cannot be change");
    }
}
public class finalusingconstructor {
    static void main(String[] args) {
        cons c=new cons();
        IO.println(c.val);
    }
}
