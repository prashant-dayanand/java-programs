import java.util.Scanner;
public class Ascii {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Characteer to Find ASCII Value: ");
        int enterChar = input.next().charAt(0);
        System.out.println("ASCII value of entered Character: " + enterChar);
        input.close();
    }
    
}
