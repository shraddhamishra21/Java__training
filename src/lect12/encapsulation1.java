package lect12;


class Bank{
    private int balance=1000;

    public void getbalance(){
        IO.println(balance );
    }
    public void setBalance(int n){
        if(n>=0 && n<balance ){
            balance -=n;
            IO.println(balance);
        }
    }
public void setdeposite(int n){
    if(n>=0 ){
        balance +=n;
        IO.println(balance);
    }

}
}

public class encapsulation1 {
    static void main(String[] args) {
        Bank b=new Bank();
    b.getbalance() ;
    b.setBalance(100);
    b.setdeposite(500) ;
    }
}
