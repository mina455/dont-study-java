package ExceptionHandling_18;

import java.util.Scanner;

class DividByZero {
	public static void main(String[] args) {
		System.out.print("두 개의 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			System.out.println("나눗셈 결과의 몫 : " + (num1/num2));
			System.out.println("나눗셈 결과의 나머지 : " + (num1%num2));
		} catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능");
			System.out.println(e.getMessage());
			// e.getMessage() : 예외상황이 발생한 이유를 담은 문자열 반환하는 메소드
		}

		System.out.println("프로그램을 종료합니다.");
	}

}

/**
 * ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황
 * ClassCastException : 허용할 수 없는 형변환 연산을 진행하는 예외상황
 * NegativeArraySizeException : 배열선언 과정에서 배열의 크기를 음수로 지정하는 예외상황
 * NullPointerException : 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황
 *
 */

