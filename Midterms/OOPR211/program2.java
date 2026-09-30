import java.util.Scanner;
import java.util.LinkedHashSet;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[8];

        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : originalArray) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        System.out.print("\nArray after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        if (uniqueArray.length < 2) {
            System.out.println("Not enough unique elements to find second largest or second smallest values.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : uniqueArray) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : uniqueArray) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
        
        scanner.close();
    }
}