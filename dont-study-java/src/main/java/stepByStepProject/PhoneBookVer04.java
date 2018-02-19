package stepByStepProject;

import java.util.Scanner;

/**
 * 데이터 클래스
 */
class PhoneInfo04 {
	String name;
	String phoneNember;

	public PhoneInfo04(String name, String num) {
		this.name = name;
		phoneNember = num;
	}

	public void showPhoneInfo04() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNember);
	}
}

class PhoneUnivInfo extends PhoneInfo04 {
	String major;
	int year;

	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}

	public void showPhoneInfo04() {
		super.showPhoneInfo04();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo04 {
	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public void showPhoneInfo04() {
		super.showPhoneInfo04();
		System.out.println("회사명 : " + company);
	}
}

/**
 * 입력, 검색, 삭제 기능 클래스
 *
 */
class PhoneBookManager04 {
	final int MAX_INFO = 100; //100 까지 데이터 제한
	PhoneInfo04[] infoStorage = new PhoneInfo04[MAX_INFO];
	int curCnt = 0;

	private PhoneInfo04 readFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();
		System.out.print("전화번호 : ");
		String num = MenuViewer04.sc.nextLine();
		return new PhoneInfo04(name, num);
	}
	private PhoneInfo04 readUnivFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();
		System.out.print("전화번호 : ");
		String num = MenuViewer04.sc.nextLine();
		System.out.print("전공 : ");
		String major = MenuViewer04.sc.nextLine();
		System.out.print("학년 : ");
		int year = MenuViewer04.sc.nextInt();
		return new PhoneUnivInfo(name, num, major, year);
	}
	private PhoneInfo04 readCompanyFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();
		System.out.print("전화번호 : ");
		String num = MenuViewer04.sc.nextLine();
		System.out.print("회사명 : ");
		String company = MenuViewer04.sc.nextLine();
		return new PhoneCompanyInfo(name, num, company);
	}

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");

		System.out.println("1. 일반, 2. 대학, 3. 회사 ");
		System.out.print("선택 >> ");
		int choice = MenuViewer04.sc.nextInt();
		MenuViewer04.sc.nextLine();
		PhoneInfo04 info = null;

		switch(choice) {
		case 1 :
			info = readFriendInfo();
			break;

		case 2 :
			info = readUnivFriendInfo();
			break;

		case 3 :
			info = readCompanyFriendInfo();
			break;

		}

		infoStorage[curCnt++] = info;
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	private int search(String name) {
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo04 curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();

		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 없습니다. \n");
		} else {
			infoStorage[dataIdx].showPhoneInfo04();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();

		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 없습니다. \n");
		} else {
			for (int idx = 0; idx < (curCnt-1); idx++) {
				infoStorage[idx] = infoStorage[idx+1];
			}
			curCnt--;
			System.out.println("데이터가 삭제 되었습니다. \n");
		}
	}
}

/**
 * 메뉴 목록
 *
 */
class MenuViewer04 {
	public static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

/**
 * main 메소드
 *
 */
public class PhoneBookVer04 {
	public static void main(String[] args) {
		PhoneBookManager04 manager = new PhoneBookManager04();
		int choice;

		while(true) {
			MenuViewer04.showMenu();
			choice = MenuViewer04.sc.nextInt();
			MenuViewer04.sc.nextLine();

			switch(choice) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
