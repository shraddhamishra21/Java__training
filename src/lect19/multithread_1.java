package lect19;


class thread extends Thread{
    public void run(){
        IO.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++) {
            IO.println("Installing...." + i * 20 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        }
    }


public class multithread_1 {
    static void main(String[] args) {
        IO.println(Thread.currentThread().getName());
        thread t = new thread();
        t.setName("one");
        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 0; i < 5; i++) {
            IO.println(i + "timer");
        }
    }
}
