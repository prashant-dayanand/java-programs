import java.util.Scanner;
public class LargestNumber {
  public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter First Number: ");
      int first = input.nextInt();
      System.out.print("Enter Second Number: ");
      int second = input.nextInt();
      System.out.print("Enter Third Number: ");
      int third = input.nextInt();

      if (first > second && first>third) {
          System.out.println("First Number is Largest: " + first);
      } else if (second>third) {
          System.out.println("Second Number is Largest: " + second);
      } else {
          System.out.println("Third Number is Largest: " + third );
      }
      }
    
}
