package classAndInstance_07;

class FruitSeller02 {
	int numOfApple;
	int myMoney;
	int APPLE_PRICE; //final 선언이 사라짐.

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

	public void initMembers(int money, int appleNum, int price) {
		//인스턴스 변수의 초기화를 위한 메소드가 삽입
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
}

class FruitBuyer02 {
	int myMoney = 10000;
	int numOfApple = 0;

	public void buyApple(FruitSeller02 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 갯수 : " + numOfApple);
	}
}

class FruitSalesMain2 {
	public static void main(String[] args) {
		FruitSeller02 seller1 = new FruitSeller02();
		seller1.initMembers(0, 30, 1500);

		FruitSeller02 seller2 = new FruitSeller02();
		seller2.initMembers(0, 20, 1000);

		FruitBuyer02 buyer = new FruitBuyer02();
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

/* 해당 파일은 2가지 문제점이 있다.
 *
 * 첫번째.
 * 자바와 같은 객체지향 프로그래밍에서 인스턴스의 생성은 매우 빈번한 일.
 * 이렇게 빈번한 인스턴스 생성 및 초기화가 두 줄에 걸쳐서 진행된다는 것은 문제점.
 *
 * 두번째.
 * APPLE_PRICE의 final 선언이 사라짐
 * final 변수는 한 번의 초기화 기회를 갖음
 * 그러나 인스턴스 메소드 내에서 final 인스턴스 변수의 값을 초기화하는 행위는 허용되지 않음
 * 즉, final 인스턴스 변수의 초기화가 인스턴스 메소드 내에서 이뤄진다는 것.
 * 한번 초기화 된 final 변수의 값이 다시 초기화되는 실수를 범할 수 있는 상황에 노출시키는 것이기 때문에
 * 이러한 형태의 초기화는 허용되지 않는다.
 *
 * 딱 한번만 호출이 될 경우에만 메소드 내 final 변수의 초기화가 허용.
 * 딱 한번만 호출이 되는 메소드는 '생성자(Constructor)'
 *
 * */
