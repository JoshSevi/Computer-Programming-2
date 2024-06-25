//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W3;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentGradeEvaluation {
    public static void main(String[] args) {

        JTextField firstField = new JTextField();
        JTextField secondField = new JTextField();
        JTextField thirdField = new JTextField();
        JTextField fourthField = new JTextField();
        JTextField name = new JTextField();
        JTextField program = new JTextField();
        JTextField course = new JTextField();

        Object[] printMessage1 = {
                "Name:", name,
                "Program: ", program,
                "Course: ", course,
        };

        JOptionPane.showMessageDialog(null, printMessage1, "Name ", JOptionPane.PLAIN_MESSAGE);
        String studentName = (name.getText());
        String studentProgram = (program.getText());
        String studentCourse = (course.getText());

        Object[] printMessage2 = {
                "First Grade:", firstField,
                "Second Grade: ", secondField,
                "Third Grade: ", thirdField,
                "Fourth Grade: ", fourthField, };

        JOptionPane.showMessageDialog(null, printMessage2, "Grades ", JOptionPane.PLAIN_MESSAGE);
        double firstGrade = Double.parseDouble(firstField.getText());
        double secondGrade = Double.parseDouble(secondField.getText());
        double thirdGrade = Double.parseDouble(thirdField.getText());
        double fourthGrade = Double.parseDouble(fourthField.getText());

        double avg = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
        String remarks = "";
        if (avg >= 75) {
            remarks = "Passed";
        } else {
            remarks = "Failed";
        }

        String finalMessage = "Student Name: " + studentName +
                "\nCourse :" + studentCourse +
                "\nProgram: " + studentProgram +
                "\n" + "1st   " + "2nd   " + "3rd   " + "4th   " + "\n" + firstGrade + " " + secondGrade + " " + thirdGrade
                + " " + fourthGrade +
                "\n" + "\nAverage: \t" + avg + "\nRemarks: \t" + remarks;
        JOptionPane.showMessageDialog(null, finalMessage, "Final Grading ", JOptionPane.PLAIN_MESSAGE);

        String file = "Student.txt";


        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter buffwrite = new BufferedWriter(writer);

            buffwrite.write("--------------------------------Student Information------------------------------------------------");
            buffwrite.newLine();
            buffwrite.write("Name               Program     Course    FirstGrade   SecondGrade ThirdGrade  FourthGrade       Average      Remarks");
            buffwrite.newLine();
            buffwrite.write(studentName+"      " + studentProgram + "      " + studentCourse + "     " + firstGrade + "         " + secondGrade + 
            "         " + thirdGrade + "         "+ fourthGrade + "       "+ avg + "      " + remarks);

            buffwrite.write("\n\n====Joshua Sevilla====");
            buffwrite.newLine();
            buffwrite.close();


    } catch(IOException ex){
        JOptionPane.showMessageDialog(null, "Error","WARNING", JOptionPane.WARNING_MESSAGE);
    }

}
}