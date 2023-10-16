package oct16;



public class Account {
    private long balance;

    public Account() {
    }

    public long getBlance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money)throws InsufficientException{
        if(balance < money) {
            throw new InsufficientException("잔고부족:"+(money-balance)+"모자람");
        }
        balance -=money;
    }
}
