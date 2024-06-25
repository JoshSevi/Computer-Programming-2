//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class Topnotcher {
    public static void main(String[] args) {
        int numScores = 10;
        String input;
        int score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
        int highestScore;
        
        input = JOptionPane.showInputDialog("Enter score #1:");
        score1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #2:");
        score2 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #3:");
        score3 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #4:");
        score4 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #5:");
        score5 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #6:");
        score6 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #7:");
        score7 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #8:");
        score8 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #9:");
        score9 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter score #10:");
        score10 = Integer.parseInt(input);
        
        highestScore = score1;
        if (score2 > highestScore) {
            highestScore = score2;
        }
        if (score3 > highestScore) {
            highestScore = score3;
        }
        if (score4 > highestScore) {
            highestScore = score4;
        }
        if (score5 > highestScore) {
            highestScore = score5;
        }
        if (score6 > highestScore) {
            highestScore = score6;
        }
        if (score7 > highestScore) {
            highestScore = score7;
        }
        if (score8 > highestScore) {
            highestScore = score8;
        }
        if (score9 > highestScore) {
            highestScore = score9;
        }
        if (score10 > highestScore) {
            highestScore = score10;
        }
        
        String message = "The 10 scores entered were:\n"
                        + score1 + "\n"
                        + score2 + "\n"
                        + score3 + "\n"
                        + score4 + "\n"
                        + score5 + "\n"
                        + score6 + "\n"
                        + score7 + "\n"
                        + score8 + "\n"
                        + score9 + "\n"
                        + score10 + "\n\n"
                        + "The highest score is: " + highestScore
                        + "\n\nJOSHUA SEVILLA";
        
        JOptionPane.showMessageDialog(null, message);
    }
}
