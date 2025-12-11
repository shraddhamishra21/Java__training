package lect7;

class Book{
    String titel="Alcemist";
    String writter="chemelo paulo";
    int Discount;
    int  price;
    void discount(int price){
        Discount =price/10;
        price=price-Discount;

        IO.println(price) ;

    }
}



public class Class7 {
    static void main() {
        Book B=new Book() ;
        IO.println(B.titel) ;
        B.discount (100);

    }
}
