package com.Banking.assignment;
import java.util.Scanner;
public class BankingSystemApp {

	    public static void main(String[] args) {
	        BankingService bankingService = new BankingServiceImpl();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Welcome to the Banking System");
	            System.out.println("1. Add Customer");
	            System.out.println("2. Add Account");
	            System.out.println("3. Add Beneficiary");
	            System.out.println("4. Add Transaction");
	            System.out.println("5. Find Customer by ID");
	            System.out.println("6. List Accounts by Customer ID");
	            System.out.println("7. List Transactions by Account ID");
	            System.out.println("8. List Beneficiaries by Customer ID");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    
	                    System.out.print("Enter Customer ID: ");
	                    int customerId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Address: ");
	                    String address = scanner.nextLine();
	                    System.out.print("Enter Contact: ");
	                    String contact = scanner.nextLine();
	                    bankingService.addCustomer(new Customer(customerId, name, address, contact));
	                    break;

	                case 2:
	                   
	                    System.out.print("Enter Account ID: ");
	                    int accountId = scanner.nextInt();
	                    System.out.print("Enter Customer ID: ");
	                    int custId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Account Type: ");
	                    String type = scanner.nextLine();
	                    System.out.print("Enter Initial Balance: ");
	                    double balance = scanner.nextDouble();
	                    bankingService.addAccount(new Account(accountId, custId, type, balance));
	                    break;

	                case 3:
	                    
	                    System.out.print("Enter Beneficiary ID: ");
	                    int beneficiaryId = scanner.nextInt();
	                    System.out.print("Enter Customer ID: ");
	                    int benCustId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Beneficiary Name: ");
	                    String benName = scanner.nextLine();
	                    System.out.print("Enter Account Number: ");
	                    String accountNumber = scanner.nextLine();
	                    System.out.print("Enter Bank Details: ");
	                    String bankDetails = scanner.nextLine();
	                    bankingService.addBeneficiary(new Beneficiary(beneficiaryId, benCustId, benName, accountNumber, bankDetails));
	                    break;

	                case 4:
	                    
	                    System.out.print("Enter Transaction ID: ");
	                    int transactionId = scanner.nextInt();
	                    System.out.print("Enter Account ID: ");
	                    int transAccountId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Transaction Type (Deposit/Withdrawal): ");
	                    String transType = scanner.nextLine();
	                    System.out.print("Enter Amount: ");
	                    double amount = scanner.nextDouble();
	                    bankingService.addTransaction(new Transaction(transactionId, transAccountId, transType, amount));
	                    break;

	                case 5:
	                   
	                    System.out.print("Enter Customer ID: ");
	                    int findCustId = scanner.nextInt();
	                    Customer customer = bankingService.findCustomerById(findCustId);
	                    System.out.println(customer != null ? customer : "Customer not found.");
	                    break;

	                case 6:
	                    
	                    System.out.print("Enter Customer ID: ");
	                    int listCustId = scanner.nextInt();
	                    System.out.println(bankingService.getAccountsByCustomerId(listCustId));
	                    break;

	                case 7:
	                   
	                    System.out.print("Enter Account ID: ");
	                    int listAccountId = scanner.nextInt();
	                    System.out.println(bankingService.getTransactionsByAccountId(listAccountId));
	                    break;

	                case 8:
	                  
	                    System.out.print("Enter Customer ID: ");
	                    int listBenCustId = scanner.nextInt();
	                    System.out.println(bankingService.getBeneficiariesByCustomerId(listBenCustId));
	                    break;

	                case 9:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 9);

	        scanner.close();
	  }
}


