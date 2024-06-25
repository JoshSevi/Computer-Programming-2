//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W2;

import javax.swing.JOptionPane;

public class Converter {
    public static void main(String[] args) {
        int numStrands = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hair strands:"));
        double avgLength = Double.parseDouble(JOptionPane.showInputDialog("Enter the average length of the hair in centimeters:"));

        double totalLength = numStrands * avgLength;
        double kmLength = totalLength / 100000;
        double milesLength = kmLength / 0.62;

        String message = String.format("Ms. Cory has %d hair strands with an average length of %.2f cm.\n" +
                "The total length of her hair is %.2f cm (%.2f km or %.2f miles).", numStrands, avgLength, totalLength, kmLength, milesLength);
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
