//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W2;
import javax.swing.JOptionPane;

public class FlashDriveCalculator {
    public static void main(String[] args) {
        int numDrives = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of flash drives:"));

        int gross = numDrives / 144;
        int dozens = (numDrives % 144) / 12;
        int extra = (numDrives % 144) % 12;

        String message = String.format("Hi Mr. Lee, you have %d gross, %d dozen, and %d extra flash drives.", gross, dozens, extra);
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
