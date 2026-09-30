import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Please enter 10 real numbers (positive or negative):");
        for (int i = 0; i < 10; i++) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid real number.");
                scanner.next();
            }
            numbers[i] = scanner.nextDouble();
        }

        double sumPositive = 0.0;
        int countPositive = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            }
        }

        int countNegative = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0) {
                countNegative++;
            }
        }

        double minValue = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println("\n--- Results ---");
        if (countPositive > 0) {
            double avgPositive = sumPositive / countPositive;
            System.out.println("Sum of positive numbers: " + sumPositive);
            System.out.println("Average of positive numbers: " + avgPositive);
        } else {
            System.out.println("Sum of positive numbers: 0 (No positive numbers entered)");
            System.out.println("Average of positive numbers: N/A (No positive numbers entered)");
        }

        System.out.println("Count of negative numbers: " + countNegative);
        System.out.println("Minimum value in the array: " + minValue);
        
        scanner.close();
    }
}