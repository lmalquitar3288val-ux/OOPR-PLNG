import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Loop runs from i = 0 to 4 (5 times)
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}