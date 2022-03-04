package ClassEx15_50;

public class Employer {
    private int myMoney;

    public Employer(int money) {
        myMoney = money;
    }
    public void payForWork(Employee emp, int money) {
        if (myMoney < money)
            return;
        emp.earnMoney(money);
        myMoney -= money;
    }
    public void showMyMoney() {
        System.out.println(myMoney);
    }
}
