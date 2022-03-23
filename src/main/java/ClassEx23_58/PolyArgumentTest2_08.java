class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product2() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;

	public void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i] = p;
		i++;
		System.out.println(p + "을/를 구입");
	}

	public void summary() {
		int sum = 0;
		String itemList = " ";

		for (int i = 0; i < item.length; i++) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ",";
		}
		System.out.println("총 금액은" +sum + "만원");
		System.out.println("구입하신 제품은" +itemList);
	}
}

public class PolyArgumentTest2_08 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}


