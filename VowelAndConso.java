import java.util.Scanner;
public class VowelAndConso {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Alphabet: ");
        char alphabet = input.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("This Alphabet is a Vowel: ");
        } else {
            System.out.println("This Alphabet is a Consonant: ");
        }
    }
    
}
