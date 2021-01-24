import java.util.Scanner;
public class MultiNum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Floating Number: ");
        double enterFirst = input.nextDouble();
        System.out.print("Enter Your Second Floating Number: ");
        double enterSecond = input.nextDouble();
        double multiNum = enterFirst * enterSecond;
        System.out.println("Product of Both Floating Number is " + multiNum);
    }
}
