package casting;

public class Exercise6_calculateSalary {
    public static void main(String[] args) {

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        /*
        Task1
        Find min and max
        Expected Output;
        Min salary = $4000.50
        Max salary 6000.25

         */

        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);

        double minSalary = Math.min(d3, Math.min(d2, d1));


        System.out.println("Min salary = $" + Math.min(d1, Math.min(d2, d3)));

        System.out.println("Max salary = $" + Math.max(d1, Math.min(d2, d3)));

        /*
        Task2
        Calculate the 10 % of the minimum salary
        Expected Output: 400.05
         */

        System.out.println(minSalary * 0.1);
    }
}
