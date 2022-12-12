package first_package;

import singleton.Student;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("I just start to learn JAVA");

        // Single
        /*
        Task
        Print Name
        Print last name
         */


        System.out.println("Olena");
        System.out.println("Shovgeniuk");


        //Code
        Student student = Student.getStudent();
        System.out.println(student);



        }
    }


