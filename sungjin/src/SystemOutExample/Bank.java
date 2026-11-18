package SystemOutExample;

public class Bank<T, M> {
    private T account;
    private M balance;

    public void setAccount(T account) {
        this.account = account;
    }
    public void setBalance(M balance) {
        this.balance = balance;
    }

    public T getAccount() { return account; }
    public M getBalance() { return balance; }

}


