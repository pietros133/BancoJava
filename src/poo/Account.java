package poo;

import utils.RandomNumberGenerator;
import utils.PixValidator;

public class Account {
    private long accountNumber;
    private String pixKey;
    private String ownerName;
    private double balance = 1000.00;

    public void createAccount(String ownerName, String pixKey) {
        this.accountNumber = RandomNumberGenerator.generateAccountNumber();
        this.ownerName = ownerName;
        setPixKey(pixKey);

        System.out.println("Account created successfully!");
        System.out.println("Account number: " + accountNumber);
    }

    // Withdraw
    public boolean withdraw(double amount) {
        if (amount <= 0.0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getPixKey() {
        return pixKey;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    // Setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPixKey(String pixKey) {
        if (PixValidator.validate(pixKey)) {
            this.pixKey = pixKey;
        } else {
            System.out.println("Invalid Pix key! (must be at least 8 characters)");
        }
    }
}