import java.util.Scanner;
public class AddTwoInt {
    public static void main(String args[])  {
      
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Your First Number: ");
       int enterFirst = input.nextInt();
       System.out.print("Entrer your second number: ");
       int enterSecond = input.nextInt();

       int sum = enterFirst + enterSecond;

       System.out.println("Sum of " + enterFirst + " and " + enterSecond + " is " + sum);
    }
    
}
