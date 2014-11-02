package lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mfong on 10/31/14.
 * Test normal use case and boundary conditions.
 */
public class PayrollCalculatorTest {

    @Test
    public void calculatePay() {
        // call method, then compare with expected results
        // within limits - reg pay
        double hours = 3;
        double payRate = 9.0;
        double expectedPay = 27.0;
        double resultPay = PayrollCalculator.computePay(hours, payRate);
        assertEquals(expectedPay, resultPay, 0.0001);
    }

    @Test
    public void calculateOTPay() {
        // within limits - OT pay
        double hours = 60.0;
        double payRate = 12.0;
        double expectedPay = 840.0; // (40 * 12) + (20 * 18) = 480 + 360 = 840
        double resultPay = PayrollCalculator.computePay(hours, payRate);
        assertEquals(expectedPay, resultPay, 0.0001);
    }

    @Test
    public void calculateOverMaxHours() {
        // outside limits - beyond MAX hours
        double hours = 60.1;
        double payRate = 12.0;
        double expectedPay = 0.0;
        double resultPay = PayrollCalculator.computePay(hours, payRate);
        assertEquals(expectedPay, resultPay, 0.0001);
    }

    @Test
    public void calculateUnderMinWage() {
        // outside limits - below Minimum Wage
        double hours = 60.1;
        double payRate = 7.99;
        double expectedPay = 0.0;
        double resultPay = PayrollCalculator.computePay(hours, payRate);
        assertEquals(expectedPay, resultPay, 0.0001);
    }
}
