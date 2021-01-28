import java.util.Scanner;
public class LCM {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Second Number: ");
        int second = input.nextInt();

        int lcm = (first>second)?first:second;

        while(true) {
            if(lcm%first==0 && lcm%second==0){
              System.out.printf("Lcm of %d and %d is %d", first, second,lcm);
              break;
            }
            lcm++;
        }
    }
    
    
}
