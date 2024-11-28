import java.util.Scanner;
public class Lab3Q1B{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("price of  1kg of rice:");
	double num1=scanner.nextDouble();
	
	System.out.print("The no of kgs brought:");
	double num2=scanner.nextDouble();
	
	scanner.close();
	double totalamount=num1*num2;
	double DiscountAmount=(totalamount*)/100;
	System.out.print("The total amount with 10% discount :"+DiscountAmount);
	}
}