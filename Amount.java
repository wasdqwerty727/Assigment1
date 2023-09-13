
public class Amount {

  public double amount;
  public String transactionType;

  public Amount(double amount, String type) {
    this.amount = amount;
    this.transactionType = type;
  }

  public String getAmount() {
    return this.transactionType + ": " + this.amount;
  }
}