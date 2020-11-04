package ex10accessmodifier;

//과일판매자를 추상화한 클래스
class FruitSellr {
	
	private int numOfApple;	//판매자의 사과 보유갯수
	private int myMoney;	// 판매수익
	final int APPLE_PRICE;	//사과의 단가
	
	
	public FruitSellr (int money, int appleNum, int price) {
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
class FruitBuyer {
	
	private int myMoney; //보유금액
	private int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer (int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSellr seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {
		
		
		//판매자1 : 보유갯수 100개, 단가 1000원
		FruitSellr seller1 = new FruitSellr(0,  100,  1000);
		
		//판매자2 : 보유갯수 80개, 단가 500원
		FruitSellr seller2 = new FruitSellr(0, 80, 500);
		
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
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
		
		/*
		멤버변수를 private으로 선언하면 외부클래스에서는 접근이 불가능하므로
		아래 코드는 에러가 발생한다.
		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고, 
		멤버메소드를 통해서만 구매가 이뤄질수 있도록 구현한다.
		 */
//		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
//		seller1.numOfApple -= 50; //사과50개를 구매했다.
//		buyer.numOfApple += 50;
//		
//		seller2.myMoney +=1000; //판매자2에게 1000원을 지불하고
//		seller2.numOfApple -= 70; //사과70개를 구매했다.
//		buyer.numOfApple += 70; //하지만 구매자의 보유금액은 차감되지 않았다.
		
		System.out.println("\n구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
