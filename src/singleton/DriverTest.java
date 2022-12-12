package singleton;

public class DriverTest {
    public static void main(String[] args) {
        Driver d1 = Driver.getDriver(); // an object
        Driver d2 = Driver.getDriver(); // same object
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();
        Driver d5 = Driver.getDriver();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}
