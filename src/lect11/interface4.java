package lect11;

interface D{
    void a();
}


class S implements D{

    public  void a(){
        IO.println("a");
    }
    public void b(){
        IO.println("b");
    }

}

public class interface4 {
    static void main() {
        S c=new S();
        c.a();
    }
}


