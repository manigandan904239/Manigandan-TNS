package com.Banking.assignment;
import java.util.List;
public interface BankingService {
	
	    void addCustomer(Customer customer);
	    void addAccount(Account account);
	    void addTransaction(Transaction transaction);
	    void addBeneficiary(Beneficiary beneficiary);
	    
	    Customer findCustomerById(int id);
	    Account findAccountById(int id);
	    Transaction findTransactionById(int id);
	    Beneficiary findBeneficiaryById(int id);
	    
	    List<Account> getAccountsByCustomerId(int customerId);
	    List<Transaction> getTransactionsByAccountId(int accountId);
	    List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
	    
	    List<Account> getAllAccounts();
	    List<Customer> getAllCustomers();
	    List<Transaction> getAllTransactions();
	    List<Beneficiary> getAllBeneficiaries();
	}


