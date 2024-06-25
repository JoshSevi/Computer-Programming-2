package M2Exam;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class StudentGradeIS {
    public static void main(String[] args)  throws Exception{
        Scanner read=new Scanner (new FileReader ("/Users/sevi/School/CPC2/M2Exam/StudentGrade2.txt")); 
        String hold="", all=""; 
        while(read.hasNext ()) {

        hold+=read.nextLine()+"\n";
        } //end of while loop 
        all="Subject\tSchedule\tUnits\tTime\t1st\t2nd\t3rd\t4th\tAverage\tPointGrade\tLetterGrade\tRemarks\n"
            +hold;

            
        JOptionPane.showMessageDialog (null, new JTextArea (all));

    }
    
}
