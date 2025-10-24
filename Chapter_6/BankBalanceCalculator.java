import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00; 
        double interestRate = 0.03; 
        int year = 1;
        int choice;

        do {
           
            balance += balance * interestRate;
              
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", 
                               year, interestRate, balance);
          
            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes\nor any other number for no >> ");
            choice = input.nextInt();

            year++;

        } while (choice == 1); 

        System.out.println("----jGRASP: Operation complete.");
        input.close();
    }
}
