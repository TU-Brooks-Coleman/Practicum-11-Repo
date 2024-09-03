// Practicum 11 (Largest of Three Program)
// (TO COMPLETE)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;

        // initialize scanner class
        Scanner sc = new Scanner(System.in);

        // prompt user for three numbers
        System.out.print("Please enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        num2 = sc.nextDouble();

        System.out.print("Please enter the third number: ");
        num3 = sc.nextDouble();
        
        // determine largest and assign to variable largest
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}
