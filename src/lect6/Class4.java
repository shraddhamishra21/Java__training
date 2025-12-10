package lect6;
class Bank{
    String name="shraddha";
    int acc=2567;
  double  bal=1500;
  int val;

  void with(int val){
      System.out.println("Balence="+bal);
      bal=bal-val;
      System.out.println("Remaning balence="+bal);

  }
  void deposite(int val){
      System.out.println("Balence="+bal);
      bal=bal+val;
      System.out.println("After deposite balence="+bal);
  }
}

public class Class4 {
  public  static void main() {

      Bank b1=new Bank();
     b1.with(500);
      b1.deposite(1000);



  }
}
