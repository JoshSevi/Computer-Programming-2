//Computer Programming concepts 2
//Joshua Sevilla - A124

package M1.W1;
import java.util.Scanner;

public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, pi, area, circumference;
        pi = 3.14;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = pi * radius * radius;
        circumference = 2 * pi * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("Joshua Sevilla");
    }
}