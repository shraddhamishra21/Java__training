package lect9;

class methodoloading3{
   public static  class Print{
        void print(int a){
            IO.println("the no.is="+a);
        }
        void print(String a){
            IO.println("the name is="+a);
        }
    }


    static void main(String[] args) {
        Print p=new Print();
        p.print(19);
        p.print("shraddha");

    }
}
