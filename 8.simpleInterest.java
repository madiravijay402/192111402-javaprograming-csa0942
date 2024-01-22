import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Are you a senior citizen? (yes/no): ");
        boolean isSeniorCitizen = scanner.next().equalsIgnoreCase("yes");

        scanner.close();

        double rate = isSeniorCitizen ? 12.0 : 10.0;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
