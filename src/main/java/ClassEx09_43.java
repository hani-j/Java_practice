public class ClassEx09_43 {
    String goodsCode;
    int stockNum;

    ClassEx09_43(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

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
