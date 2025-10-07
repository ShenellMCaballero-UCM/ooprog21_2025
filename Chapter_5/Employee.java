public class Employee {
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;

    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_RATE = 155.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

   public Employee(int employeeNumber, double payRate, double hoursWorked) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }

        if (payRate > MAX_RATE) {
            this.payRate = MAX_RATE;
        } else {
            this.payRate = payRate;
        }

        this.hoursWorked = hoursWorked;
    }

    public double getRegularPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double getOvertimePay() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            return 0;
        }
    }
}
