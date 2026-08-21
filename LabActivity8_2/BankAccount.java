package LabActivity8_2;

// BankAccount class demonstration Encapsulation
public class BankAccount {
    // Private fields (data hiding)
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    // Getter for balance
    public double getBalance(double balance){
        return balance;
    }
    
    // Setter for balance (with validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw1: " + amount);
        } else {
            System.out.println("Invalid withdraw1 amount!");
        }
    }
    
    // Display account details
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    
    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ali", 1000);
        
        // Accessing data using methods (not directly)
        account.displayAccount();
        
        account.deposit(500);
        account.withdraw(200);
        account.setBalance(3000);       // using setter
        account.displayAccount();       // call method displayAccount
    }
}










