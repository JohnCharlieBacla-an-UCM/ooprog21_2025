import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03; // 3% fixed interest rate
        char choice = 'Y';
        int year = 1;

        System.out.print("Enter your initial balance: ");
        balance = input.nextDouble();

        
        while (choice == 'Y' || choice == 'y') {
            
            balance = balance + (balance * INTEREST_RATE);

            System.out.printf("Year %d: Balance = %.2f%n", year, balance);

            System.out.print("Do you want to continue to next year? (Y/N): ");
            choice = input.next().charAt(0);

            year++;
        }
