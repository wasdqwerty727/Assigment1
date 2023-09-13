
class Main {
  public static void main(String[] args) {
    PersonalAccount acc = new PersonalAccount(32099, "Bob");

    System.out.println(acc.getBalance());
    System.out.println(acc.getAccountNumber());
    System.out.println(acc.getAccountHolder());

    acc.deposit(1000);

    System.out.println(acc.getBalance());
    
    acc.deposit(1590);
    
    System.out.println(acc.getBalance());

    acc.withdraw(590);
    acc.withdraw(3000);

    System.out.println(acc.getBalance());

    acc.printTransactionHistory();
    System.out.println("current balance :" + acc.getBalance());
    
  }
}