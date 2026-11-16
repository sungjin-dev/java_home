package package_account_try_catch;

public class BalanceInsufficentException extends Exception{
    public BalanceInsufficentException() { }
    public BalanceInsufficentException(String message) {
        super(message);
    }      
    
}
