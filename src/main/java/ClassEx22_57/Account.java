package ClassEx22_57;

public abstract class Account { // 추상클래스, 개체 생성 불가
    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(int amount) {balance += amount;}
    int withdraw(int amount) throws Exception {
        if (balance < amount)
            throw new Exception("잔액이 부족합니다.");
        balance -= amount;
        return amount;
    }
}
