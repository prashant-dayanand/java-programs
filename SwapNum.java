import java.util.Scanner;
public class SwapNum {
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First NUmber: ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = input.nextInt();

        System.out.println("Before Swapping.........");
        System.out.println("First Number: " + firstNum);
        System.out.println("Second Number: " + secondNum);
        
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After Swapping.......");
        System.out.println("First Number: " + firstNum);
        System.out.println("Second Number: " + secondNum);
    }
    
}
