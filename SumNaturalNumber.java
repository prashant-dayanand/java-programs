import java.util.Scanner;
public class SumNaturalNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter End Value to be Sum: ");
        int value = input.nextInt();
        for (int index = 0; index<=value; index++) {
            sum += index;
        }
        System.out.println(sum);
    }
    
}
