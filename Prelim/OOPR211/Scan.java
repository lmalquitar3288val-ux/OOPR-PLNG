import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        String data1, data2, data3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        data1 = input.nextLine();

        System.out.print("Enter the second word: ");
        data2 = input.nextLine();

        System.out.print("Enter the third word: ");
        data3 = input.nextLine();

        System.out.println(data1 + data2 +data3);

    }
}
