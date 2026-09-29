import java.util.Scanner;
public class GreatVal {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();
        System.out.println("-----------------------");
        System.out.println("The highest number is: ");
        System.out.println(Math.max(num1, Math.max(num2, num3)));
    }
}
