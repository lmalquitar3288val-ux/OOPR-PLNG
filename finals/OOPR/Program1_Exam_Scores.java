import java.util.Scanner;

public class ExamScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents;
        while (true) {
            System.out.print("Enter the number of students (1 to 50): ");
            numStudents = scanner.nextInt();
            if (numStudents >= 1 && numStudents <= 50) {
                break;
            }
            System.out.println("Invalid input. Please enter a number between 1 and 50.");
        }

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter score for Student #" + (i + 1) + " (0 to 100): ");
                int score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    break;
                }
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        }

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < numStudents; i++) {
            int currentScore = scores[i];
            sum += currentScore;

            if (currentScore > highest) {
                highest = currentScore;
            }
            if (currentScore < lowest) {
                lowest = currentScore;
            }

            if (currentScore >= 75) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) sum / numStudents;

        System.out.println("\n--- Exam Score Summary ---");
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Passing Scores (>= 75): " + passCount);
        System.out.println("Failing Scores (< 75): " + failCount);

        System.out.print("Student number(s) with the highest score: ");
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] == highest) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}