package lect9;

public class methodoverridding1 {
    public static class circle{

        void shape(){
            IO.println("circle");
        }

    }

   public static class triangle extends circle{
        void shape(){
            IO.println("triangle");
        }

    }

    static void main(String[] args) {
        triangle t=new triangle();
        t.shape();

    }
}
