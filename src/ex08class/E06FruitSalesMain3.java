package ex08class;

//과일판매자를 추상화한 클래스
class FruitSellr3 {
	
	int numOfApple;	//판매자의 사과 보유갯수
	int myMoney;	// 판매수익
	final int APPLE_PRICE;	//사과의 단가
	/*
	상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	일반적인 멤버메소드에서는 초기화 할수 없다.
	하지만 생성자 메소드에서는 초기화가 가능하다.
	마음대로 호출할수 없고, 객체 생성시 단 한번만 호출되는 
	특성이 동일하기 때문에 한번이상 초기화되지 않음이 보장되기 때문이다.
	 */
	public FruitSellr3 (int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	 
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재상태를 출력하는 멤버메소드
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//과일구매자를 추상화한 클래스
class FruitBuyer3 {
	
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer3 (int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSellr3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		
		
		//판매자1 : 보유갯수 100개, 단가 1000원
		FruitSellr3 seller1 = new FruitSellr3(0,  100,  1000);
		
		//판매자2 : 보유갯수 80개, 단가 500원
		FruitSellr3 seller2 = new FruitSellr3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("\n구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
	}

}
