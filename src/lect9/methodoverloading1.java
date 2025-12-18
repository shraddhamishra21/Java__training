package lect9;

public class methodoverloading1 {
    void sum(){
        IO.println("hello");

    }
    void sum(int a){
        IO.println(a);

    }
    void sum(int a,int b){
        IO.println(a+b);
    }
    static void main(String[] args) {
        methodoverloading1 m=new methodoverloading1() ;
        m.sum();
        m.sum(5);
        m.sum(5,5);

    }

}
