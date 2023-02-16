package ModuleOne;

import java.util.*;
/* Java 19.0 Paycheck
Martin Ceballos
CIS-084 Java Programming
Inputs:hours,payRate
Output:grossPay,taxes,netPay
 

 */

public class PayCheck {
    public static final double OverTimeRate = 1.5;
    public static final double TaxRate = 0.17;

    public static void main(String[] args) {
        // Variables for the program
        double hours, payRate;
        double regularHours, overTimeHours, regularPay;
        double overtimePay, grossPay;
        double taxes, netPay;

        // Input function for the hpours and payRate;
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours have you worked this week:");
        hours = input.nextDouble();

        System.out.println("What is your payrate:");
        payRate = input.nextDouble();

        // If block process to exucute the number if the employee qualifies for overtime
        // pay4
        if (hours <= 40) {
            regularHours = hours;
            overTimeHours = 0.0;
        } else {
            regularHours = hours;
            overTimeHours = regularHours - 40.0;
        }
        // Formula for the Variables
        regularPay = regularHours * payRate;
        overtimePay = overTimeHours * payRate * OverTimeRate;
        grossPay = regularPay + overtimePay;

        taxes = grossPay * TaxRate;
        netPay = grossPay - taxes;

        // OutPut block to display the paycheck values with the taxes,grossPay, and
        // netPay.

        System.out.println("Your gross pay is : " + "$" + grossPay);
        System.out.println("The taxes on your income is : " + "$" + taxes);
        System.out.println("The netpay is : " + "$" + netPay);

    }

}