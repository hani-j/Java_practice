package ClassEx23_58;

class Account {
    String acconutNo;
    String ownerName;
    int balance;

    Account(String acconutNo, String ownerName, int balance) {
        this.acconutNo = acconutNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    int withdraw(int amount) throws Exception {
        if(balance < amount)
            throw new Exception("잔액이 부족합니다");
        balance -= amount;

        return amount;
    }
}

class CheckingAccount extends Account {
    String cardNo;

    CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
        super(accountNo, ownerName, balance);
        this.cardNo = cardNo;
    }

    int pay (String cardNo, int amount) throws Exception {
        if(!cardNo.equals(this.cardNo) || (balance < amount))
            throw new Exception("지불이 불가능합니다");
        return withdraw(amount);
    }
}

public class RefTypeEx_22 {
    public static void main(String[] args) {
        Account obj = new CheckingAccount("111-22-3333333","홍길동",100000,
                "4444-5555-6666-7777");

        // Account obj=new Account("111-22-3333333","홍길동",100000);
        CheckingAccount obj2 = (CheckingAccount) obj;

        try {
            int amount=obj2.pay("4444-5555-6666-7777",47000);
            System.out.println("인출액:"+amount);
            System.out.println("카드번호:"+obj2.cardNo);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
/*
        try {
            int amount=obj.pay("4444-5555-6666-7777"); // error 부모한테 없고 자식한테있음
            System.out.println("인출액:"+amount);
            System.out.println("카드번호:"+obj.cardNo);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

 */
        // CheckingAccount obj2=obj; //부모 타입이 자식 타입에 대입 될 수 없다.
        // CheckingAccount obj2=(CheckingAccount) obj; // 형변환
    }
}
