package inheritance03_16;

import java.util.Scanner;

class Friend {
	String name;
	String phoneNum;
	String addr;

	public Friend(String name, String pnum, String addr) {
		this.name = name;
		this.phoneNum = pnum; //this 생략 가능
		this.addr = addr;
	}

	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("주소 : " + addr);
	}

	public void showBasicInfo() {

	}
}

class HighFriend extends Friend {
	String work;

	public HighFriend(String name, String pnum, String addr, String job) {
		super(name, pnum, addr);
		work = job;
	}

	public void showData() {
		super.showData();
		System.out.println("직업 : " + work);
	}

	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend (String name, String pnum, String addr, String major) {
		super(name, pnum, addr);
		this.major = major;
	}

	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
	}

	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("전공 : " + major);
	}
}

class FriendInfoHandler {
	private Friend[] myFriends;
	//Friend형 참조형 변수로 이루어진 배열.
	//Friend를 상속하는 클래스의 인스턴스면 무엇이든 저장가능.

	private int numOfFriends;

	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}

	private void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++] = fren;
	}

	public void addFriend(int choice) {
		String name, phoneNum, addr, job, major;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		name = sc.nextLine();
		System.out.println("전화번호 : ");
		phoneNum = sc.nextLine();
		System.out.println("주소 : ");
		addr = sc.nextLine();

		if(choice == 1) {
			System.out.println("직업 : ");
			job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		} else { //if(choice == 2)
			System.out.println("학과 : ");
			major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("입력 완료! \n");
	}

	public void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println("");
		}
	}

	public void showAllSimpleData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("");
		}

	}
}


class MyFriendInfoBook {
	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(10);

		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 정보 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 프로그래 종료");
			System.out.print("선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice) {
			case 1 : case 2 :
				handler.addFriend(choice);
				break;
			case 3 :
				handler.showAllData();
			case 4 :
				handler.showAllSimpleData();
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
