package lect12;


class Youtube{
    private int sub=100;
    private String name="shraddha";

  public  void getsub(){
        IO.println(sub);
    }

     void setsub(){
        sub++;
        IO.println(sub);
    }
    public void setunsub(){
        if(sub>0)
        sub--;
        IO.println(sub);
    }


    public void getname(){
        IO.println(name);
    }

}

public class encapsulation2 {
    static void main(String[] args) {
        Youtube y=new Youtube() ;
        y.getsub() ;
        y.setunsub() ;
        y.getname() ;
        y.setsub() ;

    }
}
