import java.util.Scanner;
public class Factorial {
    public static long FactorialNum(long x) {
        if (x == 0) {
            return 1;
        } else {
            return x*FactorialNum(x-1);
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Value to Find Factorial: ");
        long value = input.nextInt();

        long result = FactorialNum(value);
        System.out.println(result);
    }
    
}
