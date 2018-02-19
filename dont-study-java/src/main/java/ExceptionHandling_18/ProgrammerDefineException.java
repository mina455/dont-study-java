package ExceptionHandling_18;

import java.util.Scanner;

class AgeInputException extends Exception {
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

class ProgrammerDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요 : ");
		
		try {
			int age = readAge();
			System.out.println("당신은 " + age + "세입니다.");
		} catch (AgeInputException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws AgeInputException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0) {
			AgeInputException exception = new AgeInputException();
			throw exception;
			// throw는 예외상황이 발생되었음을 JVM에게 알리는 키워드이다.
			// 따라서 throw exception; 문장이 실행되면서 자바의 예외처리 메커니즘이 동작함
		}
		return age;
	}

}
