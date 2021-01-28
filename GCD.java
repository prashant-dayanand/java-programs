import java.util.Scanner;
public class GCD{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Second Number: ");
        int second = input.nextInt();
        int gcd = 1;

        for (int i = 1; i<=first && i<=second; i++) {
            if(first%i==0 && second%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of (" + first + ") and (" + second+ "): " + gcd);
    }

}