import java.util.Scanner; 

public class DeleteElementFromArray { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int n = 5; 
        int[] arr = new int[n]; 
        
        System.out.print("Enter Data in Array: "); 
        for (int i = 0; i < n; i++) { 
            arr[i] = scanner.nextInt(); 
        } 
        
        System.out.print("Stored Data in Array: "); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
        
        System.out.print("Enter position of Element to Delete: "); 
        int pos = scanner.nextInt(); 
        
        if (pos >= 0 && pos < n) { 
            for (int i = pos; i < n - 1; i++) { 
                arr[i] = arr[i + 1]; 
            } 
            n--; 
        } else { 
            System.out.println("Invalid position!"); 
        } 
        
        System.out.print("New data in Array: "); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
        
        scanner.close(); 
    } 
}