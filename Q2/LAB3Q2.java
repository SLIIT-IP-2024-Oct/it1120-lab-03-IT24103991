import java.util.Scanner;

public class LAB3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("NO OF OT hours: ");
        double otHours = scanner.nextDouble();

        System.out.print(" OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("Total Salary = " + totalSalary);

        scanner.close();
    }
}