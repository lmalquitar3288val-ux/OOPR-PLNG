import java.io.*;

public class Buff {
    public static void main(String args [])throws IOException{
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

       String data1, data2, data3;
       System.out.print("Enter the first word: ");
       data1 = input.readLine();
       System.out.print("Enter the second word: ");
       data2 = input.readLine();
       System.out.print("Enter the third word: ");
       data3 = input.readLine();

       System.out.println(data1 + " " + data2 + " " + data3);
    }
}
