package task;
import java.util.Scanner;
 
public class BankingApplication {
	private String customerId;
    private String customerName;
    private double balance;
    private double lastTransactionAmount;
    private String lastTransactionType;
 
    public BankingApplication(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.balance = 0.0;
        this.lastTransactionAmount = 0.0;
        this.lastTransactionType = "";
    }
 
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char option;
        do {
            System.out.println("\nWelcome " + customerName + "!");
            System.out.println("Please choose an option:");
            System.out.println("a. Bank Balance");
            System.out.println("b. Deposit Amount");
            System.out.println("c. Withdraw Amount");
            System.out.println("d. Last Transaction");
            System.out.println("e. Exit");
 
            option = scanner.next().charAt(0);
            switch (option) {
                case 'a':
                    showBalance();
                    break;
                case 'b':
                    deposit(scanner);
                    break;
                case 'c':
                    withdraw(scanner);
                    break;
                case 'd':
                    showLastTransaction();
                    break;
                case 'e':
                    exit();
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 'e');
        scanner.close();
    }
 
    private void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
 
    private void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            lastTransactionAmount = amount;
            lastTransactionType = "Deposit";
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
 
    private void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            lastTransactionAmount = amount;
            lastTransactionType = "Withdrawal";
            System.out.println("Successfully withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
 
    private void showLastTransaction() {
        if (lastTransactionAmount == 0) {
            System.out.println("No transactions have been made.");
        } else {
            System.out.println("Last transaction: " + lastTransactionType + " of $" + lastTransactionAmount);
        }
    }
 
    private void exit() {
        System.out.println("Thank you for using the banking application!");
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Customer ID: ");
	        String customerId = scanner.nextLine();
	        System.out.print("Enter Customer Name: ");
	        String customerName = scanner.nextLine();
 
	        BankingApplication app = new BankingApplication(customerId, customerName);
	        app.showMenu();
	        scanner.close();
	    }
	
	}