package M2Exam;

import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentGradeIS {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(new FileReader("/Users/sevi/School/CPC2/M2Exam/StudentGrade.txt"));
        String hold = "", all = "";
        int numSubjects = 0, numUnits = 0, numPassed = 0, numFailed = 0, numDropped = 0;
        int numA = 0, numB = 0, numC = 0, numD = 0, numE = 0, numF = 0;

        while (read.hasNext()) {
            String line = read.nextLine();
            String[] data = line.split("\t");
            String subject = data[0];
            String schedule = data[1];
            double units = Double.parseDouble(data[2]);
            String time = data[3];
            double grade1 = Double.parseDouble(data[4]);
            double grade2 = Double.parseDouble(data[5]);
            double grade3 = Double.parseDouble(data[6]);
            double grade4 = Double.parseDouble(data[7]);

            double average = (grade1 + grade2 + grade3 + grade4) / 4;
            double pointGrade = ((100 - average) + 10) / 10;
            String letterGrade = "";
            String remarks = "";

            if (average >= 90) {
                letterGrade = "A";
                numA++;
                numPassed++;
            } else if (average >= 80) {
                letterGrade = "B";
                numB++;
                numPassed++;
            } else if (average >= 75) {
                letterGrade = "C";
                numC++;
                numPassed++;
            } else if (average >= 60) {
                letterGrade = "D";
                numD++;
                numFailed++;
            } else if (average >= 21) {
                letterGrade = "E";
                numE++;
                numFailed++;
            } else {
                letterGrade = "F";
                pointGrade = 9.0;
                numF++;
                numDropped++;
                remarks = "Dropped";
            }

            if (remarks.isEmpty()) {
                if (letterGrade.equals("D") || letterGrade.equals("E")) {
                    pointGrade = 5.0;
                    remarks = "Failed";
                } else {
                    remarks = "Passed";
                }
            }

            hold += String.format("%-10s%-10s%-8.1f%-12s%-8.2f%-8.2f%-8.2f%-8.2f%-10.2f%-12.1f%-10s%-10s\n", 
                    subject, schedule, units, time, grade1, grade2, grade3, grade4, average, pointGrade, letterGrade, remarks);
            numSubjects++;
            numUnits += units;
        }
        all = String.format("%-10s%-10s%-8s%-12s%-8s%-8s%-8s%-8s%-10s%-12s%-10s%-10s\n",
                "Subject", "Schedule", "Units", "Time", "1st", "2nd", "3rd", "4th", "Average", "PointGrade", "LetterGrade", "Remarks") + hold;
        JOptionPane.showMessageDialog(null, new JTextArea(all));
        JOptionPane.showMessageDialog(null,
                "\n# Of Subjects" + numSubjects
                + "\nUnit Earned" + numUnits
                + "\n\nPassed : " + numPassed
                +"\nFailed : " + numFailed
                +"\nDropped : " + numDropped
                +"\n\nA: " +numA
                +"\nB: " +numB
                +"\nC: " +numC
                +"\nD: " +numD
                +"\nE: " +numE
                +"\nF: " +numF);

    }
}
