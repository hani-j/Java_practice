package ClassEx10_45;

public class FruitSeller {
    int numOfApple = 20;
    int myMoney = 0;
    final  int APPLE_PRICE = 1000;

    public int saleApple(int money) {
        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;

        return num;
    }

    public void showSaleResult() {
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + myMoney);
    }
}
