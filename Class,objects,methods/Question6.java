import java.util.Scanner;

class Question6 {
    String name;         
    String accountNumber; 
    String accountType;  
    double balance;       

    void setInitialValues(String name, String accNum, String accType, double balance) {
        this.name = name;
        this.accountNumber = accNum;
        this.accountType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } 
        
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } 
        
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        
        else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Depositor Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        account.setInitialValues("John Doe", "ACC12345", "Savings", 5000.0);

        account.deposit(2000);

        account.withdraw(1500);

        account.display();

    }
}
