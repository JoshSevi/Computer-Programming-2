//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class TrafficLight {
    public static void main(String[] args) {
        // Generate a random number between 0 and 2
        int randomNum = (int) (Math.random() * 3);

        // Use the random number to determine the traffic light color
        String color = "";
        switch (randomNum) {
            case 0:
                color = "green";
                break;
            case 1:
                color = "yellow";
                break;
            case 2:
                color = "red";
                break;
            default:
                break;
        }

        // Display the appropriate message based on the traffic light color
        String message = "";
        if (color.equals("green")) {
            message = "The vehicle is set to go.";
        } else if (color.equals("yellow")) {
            message = "The vehicle is set to ready.";
        } else if (color.equals("red")) {
            message = "The vehicle is set to stop.";
        }

        JOptionPane.showMessageDialog(null, message, "Traffic Light", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
