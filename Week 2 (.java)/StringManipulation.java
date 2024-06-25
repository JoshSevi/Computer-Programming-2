//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W3;
import javax.swing.JOptionPane;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "God is real";
        String str2 = "UNLESs";
        String statement;

        // 1. Determine the 8th character of str1
        char eighthChar = str1.charAt(7);
        
        // 2. Determine the index of 's' in str2
        int indexOfS = str2.indexOf('s');
        
        // 3. Convert str1 to uppercase
        String upperStr1 = str1.toUpperCase();
        
        // 4. Convert str2 to lowercase
        String lowerStr2 = str2.toLowerCase();
        
        // 5. Replace all vowels with 'x' in str1
        String replace = str1.replaceAll("[AEIOUaeiou]", "x");
        
        // 6. Display the length of the String in str1 and str2
        int str1Length = str1.length();
        int str2Length = str2.length();

        String printMessage =  "The 8th character of str1 is: " + eighthChar + "\nThe index of 's' in str2 is: " + indexOfS + "\nstr1 in uppercase: " + upperStr1 + "\nstr2 in lowercase: " 
        + lowerStr2 + "\nReplacing vowels in str1: " + replace + "\nLength of str1: " + str1Length + "\nLength of str2: " + str2Length + "\nStudent Name: Joshua Sevilla";
        JOptionPane.showMessageDialog(null, printMessage , "String Manipulation", JOptionPane.INFORMATION_MESSAGE);

        // Using Scanner to get user input
        statement = JOptionPane.showInputDialog("Enter a statement:");
        
        // 1. Combine all quotes into a sentence
        String sentence = str1 + " " + str2 + " " + statement;
        JOptionPane.showMessageDialog(null, "Combined sentence: " + sentence);
        
        // 2. Display the length of the sentence
        int sentenceLength = sentence.length();
        JOptionPane.showMessageDialog(null, "Length of the sentence: " + sentenceLength);
        
    
        // 3. Display the word "an integer" from the sentence
        if (sentence.contains("an integer")) {
            JOptionPane.showMessageDialog(null, "The word 'an integer' is present in the sentence.");
        } else {
            JOptionPane.showMessageDialog(null, "The word 'an integer' is not present in the sentence.");
        }
        
        // 4. Compare "as" from the sentence to "is" from str1
        String[] words = sentence.split(" ");
        String asWord = words[3];
        if (asWord.equals("as")) {
            JOptionPane.showMessageDialog(null, "The word 'as' from the sentence is the same as 'as' from str1.");
        } else {
            JOptionPane.showMessageDialog(null, "The word 'as' from the sentence is not the same as 'as' from str1.");
        }
        
        // 5. Reverse str2
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        JOptionPane.showMessageDialog(null, "Reversed str2: " + reversedStr2);
        JOptionPane.showMessageDialog(null, "Joshua Sevilla", "Student Name", JOptionPane.PLAIN_MESSAGE);
    }
}
