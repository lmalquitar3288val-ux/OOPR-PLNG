import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single letter: ");
        String input = scanner.next();
        
        if (input.length() == 1) {
            char ch = input.charAt(0);
            
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    System.out.println(ch + " is a Vowel.");
                } else {
                    System.out.println(ch + " is a Consonant.");
                }
            } else {
                System.out.println("Error: The character is not a valid letter.");
            }
        } else {
            System.out.println("Error: Please enter exactly one character.");
        }
        
        scanner.close();
    }
}