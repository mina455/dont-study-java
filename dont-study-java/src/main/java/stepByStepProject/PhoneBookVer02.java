package stepByStepProject;

import java.util.Scanner;

class PhoneInfo02 {
	private String name;
	private String phoneNumber;
	private String birthday;

	public PhoneInfo02 (String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		birthday = birth;
	}

	public PhoneInfo02 (String name, String num) {
		this.name = name;
		phoneNumber = num;
		birthday = null;
	}

	public void showPhoneInfo02() {
		System.out.println("이름 : " + name);
		System.out.println("전화번화 : " + phoneNumber);
		if(birthday!=null)
			System.out.println("생년월일 : "+ birthday);
		System.out.println("");
	}
}

public class PhoneBookVer02 {
	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택 : ");
	}

	public static void dataInput() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String num = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();

		PhoneInfo02 info = new PhoneInfo02(name, num, birth);
		System.out.println("\n 입력된 정보 출력...");
		info.showPhoneInfo02();

	}

	public static void main(String[] args) {
		int choice;
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {
			case 1:
				dataInput();
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
