//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class DevelopmentalTask {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        String stage = "";
        
        if (age >= 0 && age <= 5) {
            stage = "Infancy and Early Childhood";
        } else if (age >= 6 && age <= 12) {
            stage = "Middle Childhood";
        } else if (age >= 13 && age <= 17) {
            stage = "Adolescence";
        } else if (age >= 18 && age <= 35) {
            stage = "Early Adulthood";
        } else if (age >= 36 && age <= 60) {
            stage = "Middle Age";
        } else if (age > 60) {
            stage = "Later Maturity";
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age entered.");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Age " + age + " falls under the developmental task of " + stage + "." + "\n\nJOSHUA SEVILLA");
    }
}
