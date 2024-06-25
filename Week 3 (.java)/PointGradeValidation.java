//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W4;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PointGradeValidation {
        public static void main(String[] args) {
            
            JTextField studentIDField = new JTextField();
            JTextField nameField = new JTextField();
            JTextField departmentField = new JTextField();
            JTextField courseField = new JTextField();
            JTextField subjectField = new JTextField();
            JTextField firstField = new JTextField();
            JTextField exam2Field = new JTextField();
            JTextField exam3Field = new JTextField();
            JTextField finalExamField = new JTextField();
            
            Object[] message = {
                "Student ID:", studentIDField,
                "Name:", nameField,
                "Department:", departmentField,
                "Course:", courseField,
                "Subject:", subjectField,
                "First Examination:", firstField,
                "Second Examination:", exam2Field,
                "Third Examination:", exam3Field,
                "Final Examination:", finalExamField
            };
            
            int option = JOptionPane.showConfirmDialog(null, message, "Student Grades", JOptionPane.OK_CANCEL_OPTION);
            
            if (option == JOptionPane.OK_OPTION) {
                String studentID = studentIDField.getText();
                String name = nameField.getText();
                String department = departmentField.getText();
                String course = courseField.getText();
                String subject = subjectField.getText();
                int first = Integer.parseInt(firstField.getText());
                int second = Integer.parseInt(exam2Field.getText());
                int third = Integer.parseInt(exam3Field.getText());
                int fourth = Integer.parseInt(finalExamField.getText());
                
                int totalScore = first + second + third + fourth;
                double average = totalScore / 4.0;
                double pointGrade = (100 - average + 10) / 10.0;
                
                String remarks;
                if (pointGrade >= 3.0) {
                    remarks = "Failed";
                } else if (pointGrade >= 2.0) {
                    remarks = "Passed - Average";
                } else if (pointGrade >= 1.0) {
                    remarks = "Passed - Good";
                } else {
                    remarks = "Passed - Excellent";
                }
                
                String printMessage = "********Student Details********\n"
                              + "Student ID : " + studentID + "\n"
                              + "Name : " + name + "\n"
                              + "Department : " + department + "\n"
                              + "Course : " + course + "\n"
                              + "Subject : " + subject + "\n"
                              + "********Grade Details********\n"
                              + "First\tSecond\tThird\tFourth\n"
                              + first + "\t     \t" + second + "\t     \t" + third + "\t     \t" + fourth + "\n"
                              + "Average : " + average + "\n"
                              + "Point Grade : " + pointGrade + "\n"
                              + "Remarks : " + remarks
                              + "\n\nJOSHUA SEVILLA";
                
                JOptionPane.showMessageDialog(null, printMessage, "Point Grade Validation", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    