package ExceptionHandling_18;

import java.util.Scanner;

class ThrowsFromMain {
	public static void main(String[] args) throws AgeInputException {
		System.out.println("나이를 입력하세요 : ");
		int age = readAge();
		System.out.println("당신은 " + age + "세입니다.");
	}
	
	public static int readAge() throws AgeInputException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0) {
			AgeInputException exception = new AgeInputException();
			throw exception;
		}
		return age;
	}

}
