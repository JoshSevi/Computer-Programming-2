//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W2;
import javax.swing.JOptionPane;

public class calculator {
    public static void main(String[] args) {
        String input1, input2;
        double num1, num2, sum, diff, prod, quot;

        input1 = JOptionPane.showInputDialog("Enter the first number:");
        num1 = Double.parseDouble(input1);

        input2 = JOptionPane.showInputDialog("Enter the second number:");
        num2 = Double.parseDouble(input2);

        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quot = num1 / num2;

        String message = String.format("Sum: %.2f\nDifference: %.2f\nProduct: %.2f\nQuotient: %.2f", sum, diff, prod, quot);
        JOptionPane.showMessageDialog(null, message);

        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}