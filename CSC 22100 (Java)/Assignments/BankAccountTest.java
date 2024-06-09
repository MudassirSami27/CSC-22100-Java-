package Assignments;

public class BankAccountTest {
    public static void main(String [] args){
        BankAccount SamiAcc = new BankAccount("XYTLPM", "Mudassir Sami", 50.0);
        SamiAcc.getBalance();
        SamiAcc.getAccInfo();
        SamiAcc.deposit(40.0);
        SamiAcc.withdraw(50.0); 
        SamiAcc.withdraw(50.0); //Testing for Error Message
        SamiAcc.getBalance();
        SamiAcc.deposit(-1.0); //Testing for Error Message
    }
}
