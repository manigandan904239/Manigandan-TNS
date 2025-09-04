package com.Banking.assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class BankingServiceImpl implements BankingService {
	    private Map<Integer, Customer> customers = new HashMap<>();
	    private Map<Integer, Account> accounts = new HashMap<>();
	    private Map<Integer, Transaction> transactions = new HashMap<>();
	    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();

	    @Override
	    public void addCustomer(Customer customer) {
	        customers.put(customer.getCustomerID(), customer);
	    }

	    @Override
	    public void addAccount(Account account) {
	        accounts.put(account.getAccountID(), account);
	    }

	    @Override
	    public void addTransaction(Transaction transaction) {
	        transactions.put(transaction.getTransactionID(), transaction);
	        Account account = accounts.get(transaction.getAccountID());
	        if (account != null) {
	            if (transaction.getType().equalsIgnoreCase("Deposit")) {
	                account.setBalance(account.getBalance() + transaction.getAmount());
	            } else if (transaction.getType().equalsIgnoreCase("Withdrawal")) {
	                account.setBalance(account.getBalance() - transaction.getAmount());
	            }
	        }
	    }

	    @Override
	    public void addBeneficiary(Beneficiary beneficiary) {
	        beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
	    }

	    @Override
	    public Customer findCustomerById(int id) {
	        return customers.get(id);
	    }

	    @Override
	    public Account findAccountById(int id) {
	        return accounts.get(id);
	    }

	    @Override
	    public Transaction findTransactionById(int id) {
	        return transactions.get(id);
	    }

	    @Override
	    public Beneficiary findBeneficiaryById(int id) {
	        return beneficiaries.get(id);
	    }

	    @Override
	    public List<Account> getAccountsByCustomerId(int customerId) {
	        List<Account> customerAccounts = new ArrayList<>();
	        for (Account account : accounts.values()) {
	            if (account.getCustomerID() == customerId) {
	                customerAccounts.add(account);
	            }
	        }
	        return customerAccounts;
	    }

	    @Override
	    public List<Transaction> getTransactionsByAccountId(int accountId) {
	        List<Transaction> accountTransactions = new ArrayList<>();
	        for (Transaction transaction : transactions.values()) {
	            if (transaction.getAccountID() == accountId) {
	                accountTransactions.add(transaction);
	            }
	        }
	        return accountTransactions;
	    }

	    @Override
	    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
	        List<Beneficiary> customerBeneficiaries = new ArrayList<>();
	        for (Beneficiary beneficiary : beneficiaries.values()) {
	            if (beneficiary.getCustomerID() == customerId) {
	                customerBeneficiaries.add(beneficiary);
	            }
	        }
	        return customerBeneficiaries;
	    }

	    @Override
	    public List<Account> getAllAccounts() {
	        return new ArrayList<>(accounts.values());
	    }

	    @Override
	    public List<Customer> getAllCustomers() {
	        return new ArrayList<>(customers.values());
	    }

	    @Override
	    public List<Transaction> getAllTransactions() {
	        return new ArrayList<>(transactions.values());
	    }

	    @Override
	    public List<Beneficiary> getAllBeneficiaries() {
	        return new ArrayList<>(beneficiaries.values());
	}

}
