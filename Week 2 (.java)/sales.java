//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W3;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class sales {
    public static void main(String[] args) {
        String companyName = "SEVILLA COMPANY";
        int year = 2023;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[] grossIncomes = new double[12];
        double[] totalExpenses = new double[12];
        double[] netIncomes = new double[12];

        for (int i = 0; i < 12; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter gross income for " + months[i] + ":");
            grossIncomes[i] = Double.parseDouble(input);

            input = JOptionPane.showInputDialog(null, "Enter total expenses for " + months[i] + ":");
            totalExpenses[i] = Double.parseDouble(input);

            netIncomes[i] = grossIncomes[i] - totalExpenses[i];
        }

        double totalGrossIncome = 0;
        double totalExpensesAmount = 0;
        double totalNetIncome = 0;

        for (int i = 0; i < 12; i++) {
            totalGrossIncome += grossIncomes[i];
            totalExpensesAmount += totalExpenses[i];
            totalNetIncome += netIncomes[i];
        }

        String output = "********************" + companyName + "********************\n";
        output += "Year : " + year + "\n";
        output += "*****************************************************************************\n";
        output += "Month\t\tGross Income\t\tTotal Expenses\t\tNet Income\n";

        for (int i = 0; i < 12; i++) {
            output += String.format("%s\t\t$%,.2f\t\t$%,.2f\t\t$%,.2f\n", months[i], grossIncomes[i], totalExpenses[i], netIncomes[i]);
        }

        output += "TOTAL\t\t$%,.2f\t\t$%,.2f\t\t$%,.2f\n";
        output += "********************************Nothing follows********************************\n";
        output += "********************************JOSHUA SEVILLA********************************\n";


        output = String.format(output, totalGrossIncome, totalExpensesAmount, totalNetIncome);

        try {
            FileWriter writer = new FileWriter("Sales.txt");
            writer.write(output);
            writer.close();
            JOptionPane.showMessageDialog(null, "Sales data saved to Sales.txt.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to Sales.txt file.");
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
