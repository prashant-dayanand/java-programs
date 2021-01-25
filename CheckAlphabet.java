import java.util.Scanner;
public class CheckAlphabet {
  public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a Value: ");
      char value = input.next().charAt(0);
      if ((value >= 'a' && value<='z') || (value >= 'A' && value<='Z')) {
          System.out.println("Value is Alphabet.");
      } else {
          System.out.println("Value is not a Alphabet.");
      }
  }
    
}
