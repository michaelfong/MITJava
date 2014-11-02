package lab2;

/**
 * Created by mfong on 10/21/14.
 */
public class PayrollCalculator {
    static final double OVERTIME_MULTPLIER = 1.5;   // Overtime is Time and a half

    // Boundary conditions
    static final double MIN_WAGE = 8.0;
    static final double MAX_WEEKLY_HOURS = 60.0;
    static final double MAX_REGULAR_HOURS = 40.0;

    public static double computePay(double hours, double payRate) {

        double employeePay = 0.0;
        double employeeOTPay = 0.0;

        if (!isAboveMinimumWage(payRate)) {
            return 0.00;    // Throw exception: must pay at or above minimum wage
        }

        if (isAboveMaximumHours(hours)) {
            return 0.00;    // Throw exception: hours must not exceed maximum hours
        }

        if (isQualifiedForOvertime(hours)) {
            employeeOTPay =  ((hours - 40.0) * payRate * OVERTIME_MULTPLIER);
            hours = 40.00; // finished with overtime portion of hours
        }

        employeePay = (hours * payRate) + employeeOTPay;

        return employeePay;
    }

    private static boolean isAboveMinimumWage(double payRate) {
        if (payRate >= MIN_WAGE)
            return true;
        else
            return false;
    }

    private static boolean isAboveMaximumHours(double hours) {
        if (hours > MAX_WEEKLY_HOURS)
            return true;
        else
            return false;
    }

    private static boolean isQualifiedForOvertime (double hours) {
        if (hours > MAX_REGULAR_HOURS)
            return true;
        else
            return false;
    }


}

