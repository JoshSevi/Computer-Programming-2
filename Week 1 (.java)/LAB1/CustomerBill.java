//Computer Programming concepts 2
//Joshua Sevilla - A124
package M1.W1;
import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String brand, color;
        double price, grossTotal, vat, netTotal, payment, change;
        int quantity;

        System.out.print("Enter the brand of the phone: ");
        brand = input.nextLine();

        System.out.print("Enter the color of the phone: ");
        color = input.nextLine();

        System.out.print("Enter the price of the phone: ");
        price = input.nextDouble();

        System.out.print("Enter the quantity of the phone: ");
        quantity = input.nextInt();

        grossTotal = price * quantity;
        vat = grossTotal * 0.038;
        netTotal = grossTotal + vat;

        System.out.printf("\nBrand: %s\nColor: %s\nPrice per unit: %.2f\nQuantity: %d\n", brand, color, price, quantity);
        System.out.printf("Gross Total: %.2f\nVAT (3.8%%): %.2f\nNet Total: %.2f\n", grossTotal, vat, netTotal);

        System.out.print("\nEnter the amount paid by the customer: ");
        payment = input.nextDouble();

        change = payment - netTotal;
        System.out.printf("Change: %.2f\n", change);

        System.out.println("Joshua Sevilla");
    }
}

