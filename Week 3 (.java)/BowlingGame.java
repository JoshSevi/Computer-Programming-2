//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class BowlingGame {
    public static void main(String[] args) {
        int p1score1 = Integer.parseInt(JOptionPane.showInputDialog("Player 1, enter score for try 1:"));
        int p2score1 = Integer.parseInt(JOptionPane.showInputDialog("Player 2, enter score for try 1:"));
        
        int p1score2 = Integer.parseInt(JOptionPane.showInputDialog("Player 1, enter score for try 2:"));
        int p2score2 = Integer.parseInt(JOptionPane.showInputDialog("Player 2, enter score for try 2:"));
        
        int p1score3 = Integer.parseInt(JOptionPane.showInputDialog("Player 1, enter score for try 3:"));
        int p2score3 = Integer.parseInt(JOptionPane.showInputDialog("Player 2, enter score for try 3:"));
        
        int p1total = p1score1 + p1score2 + p1score3;
        int p2total = p2score1 + p2score2 + p2score3;
        
        if (p1total > p2total) {
            JOptionPane.showMessageDialog(null, "Player 1 Total Score : " + p1total + "\nPlayer 2 Total Score : " + p2total + "\nCongratulations, Player 1. You won." + "\n\nJOSHUA SEVILLA");
        } else if (p2total > p1total) {
            JOptionPane.showMessageDialog(null, "Player 1 Total Score : " + p1total + "\nPlayer 2 Total Score : " + p2total + "\nCongratulations, Player 2. You won." + "\n\nJOSHUA SEVILLA");
        } else {
            JOptionPane.showMessageDialog(null, "Player 1 Total Score : " + p1total + "\nPlayer 2 Total Score : " + p2total + "\nIt's a tie!" + "\n\nJOSHUA SEVILLA");
        }
    }
}
