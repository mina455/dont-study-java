package staticMethod_10;

/**
 * static 메소드 (클래스 메소드)
 * 
 * static 변수와 마찬가지로 static 메소드가 삽입된
 * 클래스의 모든 인스턴스로부터 접근(호출)이 가능하다.
 *
 */

class NumberPrinter {
	public static void showInt(int n) {
		System.out.println(n);
	}
	public static void showDouble(double n) {
		System.out.println(n);
	}
}

class ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20); //클래스 이름을 통해 static메소드 호출한 방법.
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);//인스턴스변수 이름을 이용한 static메소드 호출한 방법.
	}

}
