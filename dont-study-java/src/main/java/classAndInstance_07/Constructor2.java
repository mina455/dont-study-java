package classAndInstance_07;

/* 생성자의 존재 이유
 * 
 * 생성자를 통해 인스턴스 변수를 초기화하면
 * 인스턴스를 생성과 동시에 초기화 할 수 있다.
 * 이는 딱 한번 호출되는 메소드이니까
 * final로 선언된 인스턴스 변수의 초기화에도 사용이 가능하다.
 * 
 * */
class Number02{
	int num;
	
	public Number02(int n) { //생성자 정의
		// Number02 클래스의 유일한 생성자로 
		// 인스턴스 생성시에는 반드시 이 생성자가 호출되어야 한다.
		num = n;
		System.out.println("인자 전달: "+n);
	}
	public int getNumber02() {
		return num;
	}
}

class Constructor2 {
	public static void main(String[] args) {
		Number02 num1 = new Number02(10); //인스턴스 생성문
		System.out.println("메소드 반환 값 : "+num1.getNumber02());
		
		Number02 num2 = new Number02(20);
		System.out.println("메소드 반환 값 : "+num2.getNumber02());
	}

}
