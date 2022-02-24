package ClassEx11_46;

public class Account {
    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        else {
            balance -= amount;
        }
        return amount;
    }
}
