package classAndInstance_07;

class FruitSeller{
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;

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

class FruitBuyer{
	int myMoney = 5000;
	int numOfApple = 0;

	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 갯수 : " + numOfApple);
	}
}

class FruitSalesMain1 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);

		System.out.println("과일 판재자의 현재 상황");
		seller.showSaleResult();

		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}

}

// 해당 예제는 메시지 전달의 관점에서 보면 상대적으로 수준이 있는 예제


/* 객체를 생성하는 행위 -> '인스턴스화(instantiation')
 * 생성 된 객체 -> '인스턴스(instance)'
 *
 * 인스턴스(instance) 사전적 의미 : 보기, 사례, 경우, 실례, 실제
 * 인스턴스(instance)는 클래스라는 틀을 기반으로 실제화 된 대상.(실제화되었음을 강조하는 단어)
 *
 * 인스턴스 == 객체 로 봐도 무방...
 * 인스턴스 변수 == 인스턴스 필드
 *
 * 클래스에 존재하는 변수와 메소드는 메모리 공간에 할당된 형태로 존재하지 않는다.
 * 즉, 접근도 호출도 불가능. 말그대로 하나의 틀로만 역할을 다할 뿐.....
 * 객체(인스턴스)는 메모리 공간에 할당이 이루어진다 !!
 * 즉, 변수는 크기대로 메모리 공간에 할당이 되고, 메소드도 호출할 수 있는 형태로 메모리 공간에 존재
 *
 * 클래스를 정의하는 것은 자료형을 정의하는 것.
 *
 * 키워드 new에 의한 객체 생성시 생성된 객체는 메모리에 저장
 * 저장된 메모리의 주소 값이 반환되어 참조변수에 저장.
 * 참조변수에 의한 객체 접근이 가능.
 *
 * 주소 값 == 참조 값
 *
 * 확장자 .class 파일은 정의되는 클래스의 수만큼 생성
 *
 * numm로 초기화된 참조변수를 System.out.println 메소드로 출력하면
 * -> 문자열 null 출력
 *
 * */
