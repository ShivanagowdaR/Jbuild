import java.util.*;
public class BankService {
  static class BankAccount {
    double balance;
  }
  BankAccount{
    double money;
  }
  void deposit(double money){
    balance = balance + money;
  }
  void withdraw(double money){
    balance = balance - money;
  }
  double getbalance(){
    balance = money;
  }

public static void main(String[] args){
  BankAccount acc = new BankAccount(5000);
  System.out.println("initial balance : ",+acc.getbalance());
  acc.deposit(600);
   System.out.println("After deposite : ",+acc.getbalance());
  acc.withdraw(200);
   System.out.println("After withdraw : ",+acc.getbalance());
  System.out.println("Final balance : ",+acc.getbalance());
}
}

