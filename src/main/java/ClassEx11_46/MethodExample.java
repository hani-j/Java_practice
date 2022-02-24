package ClassEx11_46;

public class MethodExample {
    public static void main(String[] args) {
        Account obj1 = new Account("111-222-3333333","김영식", 200000);
        Account obj2 = new Account("555-666-7777777", "박진희", 1000000);

        obj1.deposit(1000000);
        obj2.deposit(1000000);

        printAccount(obj1);
        printAccount(obj2);
    }

    public static void printAccount(Account obj) {
        System.out.println("계좌번호 : " + obj.accountNo);
        System.out.println("예금주 이름 : " + obj.ownerName);
        System.out.println("잔액 : " + obj.balance);
        System.out.println("");
    }
}
