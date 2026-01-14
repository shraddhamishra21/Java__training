package lect18;

import java .io.* ;

public class file {
    static void main(String[] args) {
        data();
        create();
        read();
        delete();
    }

    static void create() {
        try {
            File file = new File("hello.java");
            if (file.createNewFile()) {
                IO.println("created");
            } else {
                IO.println("Already created");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    static void data() {
        try {

            FileWriter writer = new FileWriter("hello.java");
            writer.write("helloooo");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    static void read() {
        try {
            FileReader reader = new FileReader("hello.java");
            int ch;
            while ((ch = reader.read()) != -1) {
                IO.print((char) ch);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    static void delete() {
        try {
            File file = new File("hello.java");
            if (file.delete()) {
                IO.println("delete");
            } else {
                IO.println("not delete");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);


        }
    }
    }


