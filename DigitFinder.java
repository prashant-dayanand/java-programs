import java.util.Scanner;
public class DigitFinder {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        long number = input.nextInt();
        long count = 0;
        while(number!=0) {
            number/=10;
            count++;
        }
        System.out.println(count);
        
    }   
}
