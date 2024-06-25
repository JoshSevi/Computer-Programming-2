//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class OwnerValidation {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        if (firstName.equalsIgnoreCase("Mart") || firstName.equalsIgnoreCase("Anne")) {
            JOptionPane.showMessageDialog(null, firstName + " is the owner");
        } else {
            JOptionPane.showMessageDialog(null, firstName + " is the owner of nothing");
        }
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
