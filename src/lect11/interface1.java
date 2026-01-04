package lect11;



interface Teacher{
    void work();
}

class student implements  Teacher{
   public void work(){
        IO.println("learn");
    }
}

public class interface1 {
    static void main() {
        student s=new student();
        s.work();



    }
}
