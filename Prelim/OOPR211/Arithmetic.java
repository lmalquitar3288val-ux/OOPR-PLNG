import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        int choice;
        float num1, num2;
        Scanner input = new Scanner(System.in);
        String choice2;
        Scanner input2 = new Scanner(System.in);

        do {
            System.out.println("ACTIVITY #2");
            System.out.println("---------------------");
            System.out.println("Arithmetic Operations");
            System.out.println("");
            System.out.println("LIST OF OPERATION:");
            System.out.println("1. Addition     2. Subtraction      3. Multiplication");
            System.out.println("4. Division     5. Modulo           6. Increment");
            System.out.println("7. Decrement");
            System.out.print("CHOOSE AN OPERATION (1-7): ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("ADDITION");
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                float sum = num1 + num2;
                System.out.println("Result is: " + sum);
            } else if (choice == 2) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("SUBTRACTION");
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                float diff = num1 - num2;
                System.out.println("Result is: " + diff);
            } else if (choice == 3) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("MULTIPLICATION");
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                float prod = num1 * num2;
                System.out.println("Result is: " + prod);
            } else if (choice == 4) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("DIVISION");
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                float quot = num1 / num2;
                System.out.println("Result is: " + quot);
            } else if (choice == 5) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("MODULO");
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                float rem = num1 % num2;
                System.out.println("Result is: " + rem);
            } else if (choice == 6) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("INCREMENT");
                System.out.print("Enter a number: ");
                num1 = input.nextInt();

                float incr = ++num1;
                System.out.println("Result is: " + incr);
            } else if (choice == 7) {
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("DECREMENT");
                System.out.print("Enter a number: ");
                num1 = input.nextInt();

                float decr = --num1;
                System.out.println("Result is: " + decr);
            } else {
                System.out.println("Enter a VALID number! (1-7)");
            }
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Would you like to continue? YES/NO: ");
            System.out.println("------------------------------");
            choice2 = input2.nextLine();
            System.out.println("");
        }
        while(choice2.equalsIgnoreCase("YES"));
    }
}
