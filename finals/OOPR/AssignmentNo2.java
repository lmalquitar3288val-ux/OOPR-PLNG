import java.util.Scanner;

public class SearchOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[2][6];

        System.out.println("Enter 12 numbers:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbers[i][j] == search) {
                    count++;
                }
            }
        }

        System.out.println("Occurrence/s: " + count);
        scanner.close();
    }
}