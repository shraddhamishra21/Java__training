package lect9;

public class methodoverridding3{


    public static class Animal {
        String name="Animal";
       static void sound() {
            IO.println("Roar");


        }
        void hii(){
            IO.println("hii");

        }
    }

        public static class Dog extends Animal {
            String name="Dog";
          static  void sound() {
                IO.println("Bark");

            }

            void hii(){
                IO.println("hello");
            }
        }

        static void main(String[] args) {
            Animal d = new Dog();
            d.sound();      //uppercasting animal->reference and dog ->object
             d.hii();
             IO.println(d.name);    //variable cannot be override

//             Dog s= (Dog)d;       //lowercasting
//             s.hello();



        }
    }


