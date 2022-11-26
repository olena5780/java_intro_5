package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee_Exercise {
    public static void main(String[] args) {
        /*
        Create 3 companies
        name, address, phone
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111



        Create 10 employees
        fullname, jobPosition, age, company
        Andrii, Developer, 25, Tesla
        Yildiz, System Architect, 23, USBank
        Malek, Developer, 30, Verizon
        Saeed, Manager, 35, Verizon
        Samir, Tester, 20, USBank
        Viktoriya, Designer, 30, Tesla
        Ibrahim, Designer, 27, Tesla
        Jeremiah, Scrum Master, 21, USBank
        Olena, Tester, 29, Verizon
        Yoanna, Tester, 23, Tesla
         */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii","Developer", 25, c1),
                new Employee("Yildiz","System Architect", 23, c2),
                new Employee("Malek","Developer", 30, c3),
                new Employee("Saeed","Manager",35 ,c3),
                new Employee("Samir", "Tester",20, c2),
                new Employee("Viktoriya", "Designer",30 ,c1),
                new Employee("Ibrahim", "Designer",27 ,c1),
                new Employee("Jeremiah", "Scrum Master", 21 , c2),
                new Employee("Olena","Tester", 29, c3),
                new Employee("Yoanna","Tester", 23, c1)
        ));

        /*
        Write a program to find and report below information

        Employee numbers for each company
        Tesla = 4
        USBank = 3
        Verizon = 3


        Employee numbers for each position
        Tester = 3
        Developer = 2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1

        Find youngest
        Youngest tester = Samir with the age of 20
        Youngest developer = Andrii with the age of 25
        Youngest designer = Ibrahim with the age of 27

        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank
         */

        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        int testers = 0, developers = 0, managers = 0, designers = 0, systemArchitect = 0, scrumMasters = 0;


        Employee managerEmployee = new Employee();
        Employee systemArchitectEmployee = new Employee();
        Employee scrumMasterEmployee = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if(employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            if(employee.getJobPosition().equals("Tester")) testers++;
            else if (employee.getJobPosition().equals("Developer")) developers++;
            else if (employee.getJobPosition().equals("Designer")) designers++;
            else if (employee.getJobPosition().equals("System Architect")) systemArchitect++;
            else if (employee.getJobPosition().equals("Manager")) managers++;
            else scrumMasters++;

            if(employee.getJobPosition().equals("Manager")) managerEmployee = employee;
            if(employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
            if(employee.getJobPosition().equals("Scrum Master")) scrumMasterEmployee = employee;

        }

        System.out.println("\nEmployee numbers for each company\n");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("\nEmployee numbers for each position\n");
        System.out.println("Tester = " + testers + "\n" + "Developer = " + developers + "\n" + "Manager = " + managers + "\n" +
                "Designer = " + designers + "\n" +
                "System Architect = " + systemArchitect + "\n" +
                "Scrum Master = " + scrumMasters );

        System.out.println("\n-----------Find youngest--------------\n");

        Employee youngestTester = employees.stream().filter(e -> e.getJobPosition().equals("Manager")).min (Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Youngest tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());

        Employee youngestDeveloper = employees.stream().filter(e -> e.getJobPosition().equals("Developer")).min (Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Youngest developer = " + youngestDeveloper.getFullName() + " with the age of " + youngestDeveloper.getAge());

        Employee youngestDesigner = employees.stream().filter(e -> e.getJobPosition().equals("Designer")).min (Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Youngest designer = " + youngestDesigner.getFullName() + " with the age of " + youngestDesigner.getAge());

        System.out.println("\n-----------Find the company--------------\n");

        System.out.println("Manager = " + managerEmployee.getFullName() + " works at " + managerEmployee.getCompany().getName() + "\n" +
                "System Architect = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName() + "\n" +
                "Scrum Master = " +  scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());




    }
}