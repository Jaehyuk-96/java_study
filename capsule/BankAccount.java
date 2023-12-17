package capsule;

public class BankAccount {

    private int balance;

    public BankAccount(){
        balance=0;
    }

    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount)&& balance>=amount){
            balance -= amount;
        }else{
            System.out.println("잔고가 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }
    private boolean isAmountValid(int amount){
        //0보다 큰지 검증
        return amount>0;
    }
}
