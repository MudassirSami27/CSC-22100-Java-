package Assignments;

public class BankAccount {
    private String accNum;
    private String accHolderName;
    private double balance;

    //constructor
    public BankAccount(String accNum, String accHolderName, double balance){
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    //methods
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited : $" + amount);
            getAccInfo();
        }
        else {
            System.err.println("Error cannot input negative value");
        }
    }
    public void withdraw(double amount){
        if (amount < balance){
            balance -= amount;
            System.out.println("Withdrew : $" + amount);
            getAccInfo();
        }
        else {
            System.out.println("Error Withdrawal Amount Greater Than Balance");
        }
    }
    //method displaying user's account info
    public void getAccInfo(){
        System.out.println("Bank Account Info");
        System.out.println("Account Holder : " + accHolderName + " | Account Number : " + accNum + " | Current Balance : $" + balance);
    }
    public void getBalance(){
        System.out.println("Current Balance : $" + balance);
    }
}
