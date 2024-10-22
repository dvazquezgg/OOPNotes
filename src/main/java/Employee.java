public class Employee {

    private String name;
    private double payRate;
    private int EMPLOYEE_ID;
    private static int nextID = 1;
    private double STARTING_PAY_RATE;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changePayRate(double newRate) {
        payRate = newRate;
    }

    public int getNextID() {
        nextID++;
        return nextID;
    }
}
