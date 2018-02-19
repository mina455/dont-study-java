package ExceptionHandling_18;

import java.util.Scanner;

class NameLengthException extends Exception { 
	String wrongName;
	
	public NameLengthException(String name) {
		super("잘못된 이름이 삽입되었습니다.");
		wrongName = name;
	}
	
	public void showWrongName() {
		System.out.println("잘못 입력된 이름 : " + wrongName);
	}
}

class PersonalInfo {
	String name;
	int age;
	
	public PersonalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class PrintStackTrace {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			PersonalInfo readInfo = readPersonalInfo();
			readInfo.showPersonalInfo();
			
		} catch (AgeInputException e) {
			e.printStackTrace();
			// printStackTrace 메소드 호출
			// 예외가 발생한 정확한 위치를 확인할 수 있음. 그리고 예외가 전달되어 온 과정도 확인가능.
		} catch (NameLengthException e) {
			e.showWrongName();
			e.printStackTrace();
		}
	}
	
	public static PersonalInfo readPersonalInfo()
			throws AgeInputException, NameLengthException {
		String name = readName();
		int age = readAge();
		PersonalInfo pInfo = new PersonalInfo(name, age);
		return pInfo;
	}
	
	public static String readName() throws NameLengthException {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		if(name.length()<2) {
			throw new NameLengthException(name);
		}
		return name;
	}
	
	public static int readAge() throws AgeInputException {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new AgeInputException();
		}
		return age;
	}

}
