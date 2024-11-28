import java.util.Scanner;

public class LAB3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a five-digit number: ");
        double number = scanner.nextInt();
        
        
        if (number >= 10000 && number <= 99999) {
            
            double digit1 = number / 10000;
            double digit2 = (number / 1000) % 10;
            double digit3 = (number / 100) % 10;
            double digit4 = (number / 10) % 10;
            double digit5 = number % 10;
            
            
            System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
        
        
        scanner.close();
    }
}