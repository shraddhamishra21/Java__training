package lect9;

public class methodoverridding2 {

    public static class Animal {
        void sound() {
            IO.println("Roar");
        }

        public static class Dog extends Animal {
            void sound() {
                IO.println("Bark");
            }

        }

        static void main(String[] args) {
            Dog d = new Dog();
            d.sound();

        }
    }
}
