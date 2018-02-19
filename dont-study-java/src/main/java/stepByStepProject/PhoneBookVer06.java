package stepByStepProject;

/**
 * PhoneBookVer05.java (사용)
 *
 * interface INIT_MENU
 * interface INPUT_SELECT
 *
 */

class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}

/**
 * PhoneBookVer04.java (사용)
 *
 * class PhoneInfo04
 * class PhoneUnivInfo extends PhoneInfo04
 * class PhoneCompanyInfo extends PhoneInfo04
 * class MenuViewer04
 *
 */

class PhoneBookManager06 {
	final int MAX_INFO = 100; //100 까지 데이터 제한
	PhoneInfo04[] infoStorage = new PhoneInfo04[MAX_INFO];
	int curCnt = 0;

	static PhoneBookManager06 inst = null;
	public static PhoneBookManager06 createManagerInst() {
		if(inst == null) {
			inst = new PhoneBookManager06();
		}
		return inst;
	}

	private PhoneBookManager06() {

	}

	private PhoneInfo04 readFriendInfo() { //동일
		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();
		System.out.print("전화번호 : ");
		String num = MenuViewer04.sc.nextLine();
		return new PhoneInfo04(name, num);
	}
	private PhoneInfo04 readUnivFriendInfo() { //동일
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
	private PhoneInfo04 readCompanyFriendInfo() { //동일
		System.out.print("이름 : ");
		String name = MenuViewer04.sc.nextLine();
		System.out.print("전화번호 : ");
		String num = MenuViewer04.sc.nextLine();
		System.out.print("회사명 : ");
		String company = MenuViewer04.sc.nextLine();
		return new PhoneCompanyInfo(name, num, company);
	}

	public void inputData() throws MenuChoiceException {
		System.out.println("데이터 입력을 시작합니다.");

		System.out.println("1. 일반, 2. 대학, 3. 회사 ");
		System.out.print("선택 >> ");
		int choice = MenuViewer04.sc.nextInt();
		MenuViewer04.sc.nextLine();
		PhoneInfo04 info = null;
		
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);

		switch(choice) {
		case INPUT_SELECT.NORMAL :
			info = readFriendInfo();
			break;

		case INPUT_SELECT.UNIV :
			info = readUnivFriendInfo();
			break;

		case INPUT_SELECT.COMPANY :
			info = readCompanyFriendInfo();
			break;

		}

		infoStorage[curCnt++] = info;
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	private int search(String name) {  //동일
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo04 curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}

	public void searchData() { //동일
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

	public void deleteData() { //동일
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

class PhoneBookVer06 {
	public static void main(String[] args) {
		PhoneBookManager06 manager = PhoneBookManager06.createManagerInst();
		int choice;

		while(true) {
			try {
				MenuViewer04.showMenu();
				choice = MenuViewer04.sc.nextInt();
				MenuViewer04.sc.nextLine();
				
				switch(choice) {
				case INIT_MENU.INPUT :
					manager.inputData();
					break;
				case INIT_MENU.SEARCH :
					manager.searchData();
					break;
				case INIT_MENU.DELETE :
					manager.deleteData();
					break;
				case INIT_MENU.EXIT :
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}
	}
}
