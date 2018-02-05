package classAndInstance_07;

class Number {

	int num=0;

	public void addNum(int n) {
		num+=n;
	}
	public int getNumber() {
		return num;
	}
}

class PassInstance {
	public static void main(String[] args) {
		Number nInst = new Number(); // 객체 생성, 참조변수 nInst로 이를 참조
		System.out.println("메소드 호출 전 : " + nInst.getNumber()); // '0' 반환
		// nInst.getNumber() -> nInst가 참조하는 객체의 getNumber메소드를 호출.

		simpleMethod(nInst);
		System.out.println("메소드 호출 후 : " + nInst.getNumber() );

	}
	public static void simpleMethod(Number numb) {
		numb.addNum(12);
	}
}