package lect13;

final class student{
   int marks=10;
}

public class finalobject {
    static void main(String[] args) {
        student s = new student();
        s.marks=20;

        IO.println(s.marks);
    }
}
