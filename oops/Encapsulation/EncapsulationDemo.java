package oops.Encapsulation;

class Bank {
    public String name;
    protected String accountNumber;
    private int balance;

    public Bank(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be a positive");
        }

    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("WithDraw Successfully");
        } else if (amount > 0) {
            System.out.println("amount must be greater that balance");
        } else {
            System.out.println("Amount be less than current balnace");
        }
    }

    public int getBalance() {
        return balance;
    }

}



public class EncapsulationDemo {
    public static void main(String[] args) {

        Bank myAccount = new Bank("Tushar", "232323", 100000);

        System.out.println(myAccount.name);
        System.out.println(myAccount.accountNumber);

        myAccount.deposit(200);
        myAccount.withdraw(100);

        System.out.println("Current Balance: "+ myAccount.getBalance());

    

    }
}
