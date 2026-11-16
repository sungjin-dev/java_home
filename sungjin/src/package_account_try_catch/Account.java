package package_account_try_catch;

public class Account {
    private  long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws BalanceInsufficentException {
        if(balance < money) {
            throw new BalanceInsufficentException("잔고부족:" + (money-balance) + "모자람");
        }
        balance -= money;
    }
}

