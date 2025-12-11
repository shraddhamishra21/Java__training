package lect8;




    class Employee{
        void work(){
            IO.println("NO i have anothore work");

        }
    }

    class Manager extends Employee {

        void attendmeeting() {
            IO.println("Attend the meeting immedeatly");

        }
    }


        public class single {
            static void main(String[] args) {
                Manager M = new Manager();
                M.attendmeeting();
                M.work();


            }
        }



