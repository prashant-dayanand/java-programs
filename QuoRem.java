import java.util.Scanner;
public class QuoRem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Divisor Value: ");
        int divior = input.nextInt();
        System.out.print("Enter Your Dividend Value: ");
        int dividend = input.nextInt();

        int quotient = dividend / divior;
        int remainder = dividend % divior;

        System.out.println("Remainder is " + remainder+ " and Quotient is " + quotient);
    }
    
}
