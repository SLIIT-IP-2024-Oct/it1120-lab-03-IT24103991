import java.util.Scanner;
	public class Lab3Q1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("price of  1kg of rice:");
	double num1=scanner.nextDouble();
	
	System.out.print("The no of kgs brought:");
	double num2=scanner.nextDouble();
	
	scanner.close();
	
	double totalamount=num1*num2;
	System.out.print("The total amount: "+totalamount); 
	
	}
	}	
