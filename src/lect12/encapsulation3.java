package lect12;


 class insta{
   private int follower=0;
  private  int following=0;
  private  int post=0;

 public void setfollower(){
          follower++;
     }

  public  void getfollower() {
      IO.println(follower);

  }
      public void setfollowing(){
          following++;
      }

      public  void getfollowing() {
          IO.println(following);

      }
          public void setpost(){
              post++;
          }

          public  void getpost(){
              IO.println(post);
    }
}

public class encapsulation3 {
    static void main() {
        insta i=new insta();
        i.setfollower() ;
        i.setfollowing() ;
        i.setpost() ;
        i.getfollower() ;
        i.getfollowing() ;
        i.getpost() ;



    }
}
