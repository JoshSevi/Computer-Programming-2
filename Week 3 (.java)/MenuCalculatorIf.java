//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class MenuCalculatorIf {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter first number:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter second number:");
        double num2 = Double.parseDouble(input2);

        String menu = "Please select an operation:\n" +
                "[A]dd\n" +
                "[S]ubtract\n" +
                "[M]ultiply\n" +
                "[D]ivide\n" +
                "[Q]uit" +
                "\n\nJOSHUA SEVILLA";

        boolean quit = false;
        while (!quit) {
            String choice = JOptionPane.showInputDialog(menu);

            if (choice == null || choice.equalsIgnoreCase("Q")) {
                JOptionPane.showMessageDialog(null, "Program terminating...");
                quit = true;
            } else if (choice.equalsIgnoreCase("A")) {
                double result = num1 + num2;
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result);
            } else if (choice.equalsIgnoreCase("S")) {
                double result = num1 - num2;
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result);
            } else if (choice.equalsIgnoreCase("M")) {
                double result = num1 * num2;
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result);
            } else if (choice.equalsIgnoreCase("D")) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Error: cannot divide by zero.");
                } else {
                    double result = num1 / num2;
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + result);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice.");
            }
        }
    }
}
