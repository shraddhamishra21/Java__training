package lect7;

class Car{
    String brand;
    String model;
    int price;
    void details(String brand ,String model,int price){
        System.out.println("Brand="+brand);
        IO.println("Model is="+model);
        IO.println("Price="+price);

    }
}


public class Class5 {
    static void main() {
        Car c1=new Car();
        c1.details("audi","air",1800000);
        Car c2=new Car();
        c2.details("bmw","m4",1500000);
    }
}
