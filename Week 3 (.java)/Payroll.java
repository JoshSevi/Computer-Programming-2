//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class Payroll {
    public static void main(String[] args) {
        double basePay = 0.0;
        int hoursWorked = 0;
        double totalPay = 0.0;

        // Get base pay from user
        String inputBasePay = JOptionPane.showInputDialog("Enter base pay per hour:");
        try {
            basePay = Double.parseDouble(inputBasePay);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            System.exit(0);
        }

        // Get hours worked from user
        String inputHoursWorked = JOptionPane.showInputDialog("Enter hours worked:");
        try {
            hoursWorked = Integer.parseInt(inputHoursWorked);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            System.exit(0);
        }

        // Calculate total pay
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else if (hoursWorked > 40 && hoursWorked <= 60) {
            int overtimeHours = hoursWorked - 40;
            double overtimePay = basePay * 1.5 * overtimeHours;
            double normalPay = basePay * 40;
            totalPay = overtimePay + normalPay;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Hours worked cannot exceed 60.");
            System.exit(0);
        }

        // Check if total pay exceeds minimum wage
        if (totalPay < 8.0 * hoursWorked) {
            JOptionPane.showMessageDialog(null, "Error: Base pay cannot be less than $8.00 an hour.");
            System.exit(0);
        }

        // Display total pay to user
        JOptionPane.showMessageDialog(null, "Total pay: $" + String.format("%.2f", totalPay));
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
