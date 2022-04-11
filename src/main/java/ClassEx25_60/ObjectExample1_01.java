package ClassEx25_60;

class GoodsStock extends Object {
    String goodsCode;
    int stockNum;

    GoodsStock(String goodsCode,int stockNum) {
        this.goodsCode=goodsCode;
        this.stockNum=stockNum;
    }
    // overriding
    public String toString() {
        String str="상품코드:"+goodsCode+" 재고수량:"+stockNum;
        return str;
    }
}

public class ObjectExample1_01 {
    public static void main(String[] args) {
        GoodsStock obj=new GoodsStock("57293",100);
        String str=obj.toString();
        System.out.println(str);
        System.out.println(obj.toString()); // 상품코드:57293 재고수량:100
        System.out.println(obj);
    }
}
