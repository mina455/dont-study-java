package methodAndVariableScope_06;

public class MethodReturns {
	// void는 값을 반환하지 않는다.(메소드를 호출한 영역으로 값을 전달하지 않음)
	public static void main(String[] args) {
		int result = adder(4,5);
		System.out.println("4와 5의 합: " + result);
		System.out.println("3.5의 제곱: " + square(3.5));
	}

	// adder메소드는 int형 데이터 반환
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult; //addResult에 저장되어 있는 값을 반환
	}

	// square메소드는 double형 데이터 반환
	public static double square(double num) {
		return num * num;
	}
	// **** 메소드에 둘 이상의 값을 전달할 수는 있어도, 메소드는 오직 하나의 값만을 반환할 수 있다!!!

}
