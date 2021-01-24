import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Digit: ");
        int digit = input.nextInt();
        if (digit % 2 == 0) {
            System.out.println("Digit is Even.");
        } else {
            System.out.println("Digit is Odd.");
        }
    }
}