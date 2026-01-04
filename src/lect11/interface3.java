package lect11;


interface A{
    void a();
}
interface B{
    void b();

}

class C implements A,B{

   public  void a(){
        IO.println("a");
    }
     public void b(){
        IO.println("b");
    }

}

public class interface3 {
    static void main() {
        C c=new C();
        c.a();
    }
}
