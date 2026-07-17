import java.util.Scanner;

public class Main {
    // I. Declare your variables (static so they can be used across methods)
    static double balance = 0.0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        // II. Display a menu and keep it running until the user decides to exit
        do {
            System.out.println("\n=== JAVA BANKING SYSTEM ===");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // III. Get and process the user choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    // VII. Create an exit message at the end
                    System.out.println("\nThank you for using the Java Banking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);
    }

    // IV. Create a method of show balance (showBalance())
    public static void showBalance() {
        System.out.printf("\nYour current balance is: $%.2f\n", balance);
    }

    // V. Create another method (deposit()) to make a deposit
    public static void deposit() {
        System.out.print("\nEnter the amount to deposit: $");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f\n", amount);
            showBalance();
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // VI. Create a method (withdraw()) to withdraw funds
    public static void withdraw() {
        System.out.print("\nEnter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        
        if (amount > balance) {
            System.out.println("Transaction Declined: Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f\n", amount);
            showBalance();
        }
    }
}