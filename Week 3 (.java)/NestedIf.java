//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;

public class NestedIf {
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog(null, "What day is it today?");
        String weather = JOptionPane.showInputDialog(null, "What is the weather today? (Sunny, Rainy, Gloomy)");

        String activity = "";
        String suggestion = "";

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday")) {
            activity = "School";
        } else if (day.equalsIgnoreCase("Wednesday")) {
            activity = "School + Date";
        } else if (day.equalsIgnoreCase("Thursday")) {
            activity = "School";
        } else if (day.equalsIgnoreCase("Friday")) {
            activity = "School + Party";
        } else if (day.equalsIgnoreCase("Saturday")) {
            activity = "Bonding with Friends";
        } else if (day.equalsIgnoreCase("Sunday")) {
            activity = "Church + Family Bonding";
        } else {
            activity = "Unknown";
        }

        if (weather.equalsIgnoreCase("Sunny")) {
            suggestion = "Bring a Hat or Umbrella";
        } else if (weather.equalsIgnoreCase("Rainy")) {
            suggestion = "Bring an Umbrella or Raincoat";
        } else if (weather.equalsIgnoreCase("Gloomy")) {
            suggestion = "Ride a taxi";
        } else {
            suggestion = "Unknown";
        }

        JOptionPane.showMessageDialog(null, "Today is " + day + ", and the weather is " + weather +
                ". \nYou should do " + activity + ".\n" + "Suggestion: " + suggestion + "." + "\n\nJOSHUA SEVILLA");
    }
}
