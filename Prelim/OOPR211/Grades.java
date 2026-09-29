import java.util.Scanner;

public class Grades{
    public static void main(String[] args){

        String choice;
        Scanner input2 = new Scanner(System.in);

        do{
            System.out.println("---ACTIVITY 1:---");
            System.out.println("------------------------------");
            System.out.println("[Using If-Else Statements]");

            Scanner input = new Scanner(System.in);
            int javaGrade, cGrade, dbGrade;

            System.out.print("Enter your Java Programming Score: ");
            javaGrade = input.nextInt();

            System.out.print("Enter your C Programming Score: ");
            cGrade = input.nextInt();

            System.out.print("Enter your Data Base Programming Score: ");
            dbGrade = input.nextInt();

            int sum = javaGrade + cGrade + dbGrade;
            float ave = (float)sum / 3;

            if(ave >= 90 && ave <= 100){
                System.out.println("Your average grade is " + ave + ", and the grade is A.");
            }
            else if(ave >= 80 && ave <= 89){
                System.out.println("Your average grade is " + ave + ", and the grade is B.");
            }
            else if(ave >= 75 && ave <= 79){
                System.out.println("Your average grade is " + ave + ", and the grade is C.");
            }
            else if(ave <= 74){
                System.out.println("Your average grade is: " + ave + ", and the grade is F.");
            }

            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("[Using Switch Case Statements]");

            int javaGrade2, cGrade2, dbGrade2;

            System.out.print("Enter your Java Programming Score: ");
            javaGrade2 = input.nextInt();

            System.out.print("Enter your C Programming Score: ");
            cGrade2 = input.nextInt();

            System.out.print("Enter your Data Base Programming Score: ");
            dbGrade2 = input.nextInt();

            int sum2 = javaGrade2 + cGrade2 + dbGrade2;
            float ave2 = (float)sum2 / 3;
            int forSwitchCase = (int)ave2;

            switch(forSwitchCase){
                case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90:
                    System.out.println("Your average grade is " + ave2 + ", and the grade is A.");
                    break;
                case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80:
                    System.out.println("Your average grade is " + ave2 + ", and the grade is B.");
                    break;
                case 79, 78, 77, 76, 75:
                    System.out.println("Your average grade is " + ave2 + ", and the grade is C.");
                    break;
                default:
                    System.out.println("Your average grade is " + ave2 + ", and the grade is F.");
            }
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Would you like to continue? YES/NO: ");
            System.out.println("------------------------------");
            choice = input2.nextLine();
            System.out.println("");
        }
        while(choice.equalsIgnoreCase("YES"));

        System.out.print("Program Terminated");
    }
}