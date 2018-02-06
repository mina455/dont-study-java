package classAndInstance_07;

class FruitSeller03{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	/* 총 3개의 인스턴스 변수를 초기화할 수 있는 생성자 정의
	 * 그리고 이 생성자 안에서는 final 변수의 초기화가 가능하기 때문에
	 * 상단의 APPLE_PRICE 변수는 final로 선언 되었다.
	 * */
	public FruitSeller03(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer03 { 
	int myMoney;
	int numOfApple;
	
	public FruitBuyer03(int money) {
		myMoney = money;
		numOfApple = 0;
	}
	
	public void buyApple(FruitSeller03 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("현재 잔액 :"+myMoney);
		System.out.println("사과 갯수 :"+numOfApple);
	}
}

public class FruitSalesMain3 {
	public static void main(String[] args) {
		FruitSeller03 seller1 = new FruitSeller03(0, 30, 1500);
		FruitSeller03 seller2 = new FruitSeller03(0, 20, 1000);
		
		FruitBuyer03 buyer = new FruitBuyer03(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재 상황");
		seller1.showSaleResult();
		System.out.println("과일 판매자2의 현재 상황");
		seller2.showSaleResult();
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}

}