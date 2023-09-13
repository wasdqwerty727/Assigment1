
import java.util.ArrayList;

public class PersonalAccount{

  public int accountNumber;
  public String accountHolder;
  public double balance;

  ArrayList<Amount> transactions = new ArrayList<Amount>();

  public PersonalAccount(int accountNumber, String accountHolder){
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = 0;
  }

  //method
  public void deposit(double amount){
    Amount a1 = new Amount(amount, "deposit");
    transactions.add(a1);
    balance = balance + amount;
  }

  //method
  public void withdraw(double amount){
    if (balance > amount){
    Amount a2 = new Amount(amount, "withdraw");
    transactions.add(a2);
    balance = balance - amount;
    }
    else{
      System.out.println("Not enough money");
    }
  }
  
  //method
  public void printTransactionHistory(){
    for(int i=0; i<transactions.size(); i++){
      System.out.println(transactions.get(i).getAmount());
    }
  }

  //method
  public double getBalance(){
    return balance;
  }

  //method
  public int getAccountNumber(){
    return accountNumber;
  }

  //method
  public String getAccountHolder(){
    return accountHolder;
  }
  
}