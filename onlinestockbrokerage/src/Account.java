public class Account {

    private final String accountId;

    private final User user;

    private  double balance;

    private final Portfolio portfolio;

    public String getAccountId() {
        return accountId;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void withdraw(double price){
        balance = balance-price;
    }

    public void deposit(double price){
        balance = balance+price;
    }

    public Account(String accountId, User user, double balance, Portfolio portfolio) {
        this.accountId = accountId;
        this.user = user;
        this.balance = balance;
        this.portfolio = portfolio;
    }
}
