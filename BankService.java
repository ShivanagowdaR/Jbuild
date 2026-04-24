public class BankService {    
    static class BankAccount {
        double balance;
        BankAccount(double money) {
            balance = money;
        }

        
        void deposit(double money) {
            balance = balance + money;
        }

        
        void withdraw(double money) {
            balance = balance - money;
        }

        
        double getBalance() {
            return balance;
        }
    }

    
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(600);
        System.out.println("After Deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("After Withdraw: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
