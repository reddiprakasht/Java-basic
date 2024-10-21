import java.util.Scanner;

public class BankingApp {
    private static double balance = 0.0;
    private static double lastTransaction = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for customer ID and name
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        // Display options to the user
        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("a) Bank balance");
            System.out.println("b) Deposit amount");
            System.out.println("c) Withdraw amount");
            System.out.println("d) Last transaction");
            System.out.println("e) Exit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case "b":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        lastTransaction = depositAmount;
                        System.out.printf("Deposited: $%.2f%n", depositAmount);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;
                case "c":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        lastTransaction = -withdrawAmount;
                        System.out.printf("Withdrew: $%.2f%n", withdrawAmount);
                    } else {
                        System.out.println("Invalid withdraw amount.");
                    }
                    break;
                case "d":
                    if (lastTransaction > 0) {
                        System.out.printf("Last transaction: Deposit of $%.2f%n", lastTransaction);
                    } else if (lastTransaction < 0) {
                        System.out.printf("Last transaction: Withdrawal of $%.2f%n", -lastTransaction);
                    } else {
                        System.out.println("No transactions made yet.");
                    }
                    break;
                case "e":
                    exit = true;
                    System.out.println("Thank you for using the banking application!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
