package lect6;

class student{
    String name;
    int rollno;
    void display(String name,int rollno){
        System.out.println(name+rollno);
    }
}

public class Class2 {
    static void main() {
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.display("shraddha- ",309);
        s2.display("stuti- ",334);
        s3.display("tanisha- ",342);


    }
}
