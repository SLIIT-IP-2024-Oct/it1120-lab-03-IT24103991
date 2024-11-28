import java.util.Scanner;

public class LAB3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        
        for (int denom : denominations) {
            int count = amount / denom;  
            System.out.println(denom + " Notes – " + count);
            amount = amount % denom;  
        }
        
        scanner.close();
    }
}