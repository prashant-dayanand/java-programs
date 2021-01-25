import java.util.Scanner;
public class MultiTable {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter A Value To Print Table: ");
      int table = input.nextInt();
      System.out.println("Table Of " + table);
      for (int index = 1; index <= 10; index++) {
          System.out.println(table*index);
      }

    }
    
}
