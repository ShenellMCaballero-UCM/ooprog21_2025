import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        final double INTEREST_RATE = 0.03;
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();

        while (true) {
            System.out.print("Do you want to see next year's balance? \nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            if (choice != 1) {
                break;
            }

            year++;
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f%% interest rate, balance is %.2f%n", year, INTEREST_RATE * 100, balance);
        }

        System.out.println("----- jGRASP: Operation complete.");
        input.close();
    }
}
