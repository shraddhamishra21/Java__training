

interface Walk{
    void walk();
}


interface Run{
    void run();
}

class human implements Run,Walk {
    public void walk(){
        IO.println("walk");
    }
    public void run(){
        IO.println("run");
    }
}

public class interface2 {
    static void main() {
      human h=new human();
      h.run();
      h.walk();


    }
}

