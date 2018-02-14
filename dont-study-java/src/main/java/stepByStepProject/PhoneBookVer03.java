package stepByStepProject;

import java.util.Scanner;

/**
 * 데이터 클래스
 *
 */
class PhoneInfo03 {
	String name;
	String phoneNember;
	String birthday;

	public PhoneInfo03(String name, String num, String birth) {
		this.name = name;
		phoneNember = num;
		birthday =birth;
	}

	public PhoneInfo03(String name, String num) {
		this.name = name;
		phoneNember = num;
		birthday = null;
	}

	public void showPhoneInfo03() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNember);
		if(birthday!=null)
			System.out.println("생년월일 : " + birthday);
		System.out.println(""); //데이터 구분을 위한
	}
}

/**
 * 입력, 검색, 삭제 기능 클래스
 *
 */
class PhoneBookManager {
	final int MAX_INFO = 100; //100 까지 데이터 제한
	PhoneInfo03[] info = new PhoneInfo03[MAX_INFO];
	int curCnt = 0;

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전화번호 :");
		String num = MenuViewer.sc.nextLine();
		System.out.print("생년월일 :");
		String birth = MenuViewer.sc.nextLine();

		info[curCnt++] = new PhoneInfo03(name, num, birth);
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	private int search(String name) {
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo03 curInfo = info[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer.sc.nextLine();

		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 없습니다. \n");
		} else {
			info[dataIdx].showPhoneInfo03();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer.sc.nextLine();

		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 없습니다. \n");
		} else {
			for (int idx = 0; idx < (curCnt-1); idx++) {
				info[idx] = info[idx+1];
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
class MenuViewer {
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
class PhoneBookVer03 {
	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();
		int choice;

		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();

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
