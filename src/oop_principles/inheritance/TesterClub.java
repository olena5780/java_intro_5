package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {
        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        FrontendTester ft2 = new FrontendTester("Olena", 45, "1988", "777", false);

        BackendTester bt1 = new BackendTester("John", 29, "1982", "111", false);
        BackendTester bt2 = new BackendTester("Mary", 36, "1986", "222", false);

        Tester[] testers = {ft1, ft2, bt1, bt2};// Polymorphic array

        /*
         Manual Testers = 3
         Automation Testers = 1
         Average age = 33
         */

        int autTesters = 0;
        int manTesters = 0;
        int container = 0;
        int sumAge = 0;
        for (Tester tester : testers) {
            if(tester.isAutomationTester) autTesters++;
                    else manTesters++;
                    sumAge+= tester.age;

        }
        System.out.println("Manual tester = " + manTesters);
        System.out.println("Automation tester = " + autTesters);
        System.out.println("Average age = " + sumAge/ testers.length);//33
    }
}
