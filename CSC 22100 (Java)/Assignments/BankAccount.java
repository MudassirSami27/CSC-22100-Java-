package Assignments;

public class BankAccount {
    private String accNum;
    private String accHolderName;
    private double balance;

    //constructor
    public BankAccount(String accNum, String accHolderName, double balance){
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = 0.0;
    }

    //methods
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited : $" + amount);
            System.err.println("Current Balance : $" + balance);
        }
        else {
            System.err.println("Error cannot input negative value");
        }
    }
    public void withdraw(double amount){
        if (amount < balance){
            balance -= amount;
            System.out.println("Withdrew : $" + amount);
            System.out.println("Current Balance : $" + balance);
        }
        else {
            System.out.println("Error Withdrawal Amount Greater Than Balance");
        }
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public void getaccHolderName(){
        System.out.println(accHolderName);
    }
    public void getaccNum(){
        System.out.println(accNum);
    }
    public static void main(){
        
    }
}
