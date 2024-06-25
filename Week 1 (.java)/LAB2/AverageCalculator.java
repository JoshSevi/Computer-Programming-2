//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W2;
import javax.swing.JOptionPane;

public class AverageCalculator {
        public static void main(String[] args) {
            double[] numbers = new double[10];
            double sum = 0;
            
            for (int i = 0; i < numbers.length; i++) {
                String input = JOptionPane.showInputDialog("Enter number " + (i+1) + ":");
                double num = Double.parseDouble(input);
                numbers[i] = num;
                sum += num;
            }
            
            double average = sum / numbers.length;
            
            String output = "Numbers entered: ";
            for (double num : numbers) {
                output += num + " ";
            }
            output += "\nAverage: " + average;
            
            JOptionPane.showMessageDialog(null, output);
    
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
