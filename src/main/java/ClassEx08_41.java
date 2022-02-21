public class ClassEx08_41 {
    String goodsCode;
    int stockNum;

    void addStock(int amount) {
        stockNum += amount;
    }

    int subtractStock(int amount) {
        if (stockNum < amount)
            return 0;
        stockNum -= amount;

        return amount;
    }
}
