package package_try_catch_ex001;

public class BalanceInsufficentException extends Exception {
    public BalanceInsufficentException() {}
    public BalanceInsufficentException(String message) {
        super(message); 
}

int balance = 0;


public void withdraw(int money) throws BalanceInsufficentException {
    if(balance < money) {
        throw new BalanceInsufficentException("잔고부족: " + (money - balance)+ " 모자람");
    }
}

}

