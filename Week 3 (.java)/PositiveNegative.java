//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class PositiveNegative {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);
        
        if (number > 0) {
            JOptionPane.showMessageDialog(null, number + " is a positive number.");
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, number + " is a negative number.");
        } else {
            JOptionPane.showMessageDialog(null, "0 is not a positive or negative number.");
        }
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
