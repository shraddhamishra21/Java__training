package lect8;



class device {
  void  powerOn(){
      IO.println("Power is on now");
    }
}

class laptop extends device{
    void boot(){
        IO.println("booting");

    }
}

class GM extends laptop  {
    void startgame(){
        IO.println("Now you can start gaming");
    }
}



public class multilevel {

    static void main(String[] args) {
        GM g=new GM();
        g.powerOn();
        g.boot();
        g.startgame();

    }


}
