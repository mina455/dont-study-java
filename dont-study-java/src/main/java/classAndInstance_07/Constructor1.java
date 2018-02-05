package classAndInstance_07;

/* 딱 한번만 호출이 되는 메소드는 '생성자(Constructor)'
 *
 * 생성자의 조건
 * 1. 클래스 이름과 동일한 이름의 메소드
 * 2. 반환형이 선언되어 있지 않으면서, 반환하지 않는 메소드
 *
 * *** <중요> 자바의 인스턴스 생성시에는 반드시 생성자가 호출되어야 합니다. ****
 *
 * */
class Number01{
	int num;

	public Number01() { //생성자!!
		num = 10;
		System.out.println("생성자 호출!");
	}
	public int getNumber01() {
		return num;
	}
}

class Constructor1 {
	public static void main(String[] args) {
		Number01 num1 = new Number01();
		// new Number01 -> Number01의 인스턴스 생성
		// Number01() -> Number01() 생성자 호출
		System.out.println(num1.getNumber01());

		Number01 num2 = new Number01();
		System.out.println(num2.getNumber01());
	}
}

