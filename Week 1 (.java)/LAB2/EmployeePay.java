//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W2;
import javax.swing.JOptionPane;

public class EmployeePay {

    public static void main(String[] args) {
        
        final double SSS = 175.89;
        final double PHILHEALTH = 300.00;
        final double ABSENCE_RATE = 5.75;
        final double LATE_RATE = 3.25;

        double ratePerHour = Double.parseDouble(JOptionPane.showInputDialog("Enter rate per hour: "));
        double hours_worked = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked: "));
        double absences = Double.parseDouble(JOptionPane.showInputDialog("Enter number of absences: "));
        double late = Double.parseDouble(JOptionPane.showInputDialog("Enter number of late hours: "));

        double gross = ratePerHour * hours_worked;

        double totalDeduction = (absences * ABSENCE_RATE) + (late * LATE_RATE) + SSS + PHILHEALTH;

        double net = gross - totalDeduction;

        JOptionPane.showMessageDialog(null, "Gross pay: " + gross +
                                            "\nTotal deductions: " + totalDeduction +
                                            "\nNet pay: " + net);
                                        
       JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
