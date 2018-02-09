package stepByStepProject;

class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birthday;

	public PhoneInfo (String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public PhoneInfo (String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		birthday = null;
	}

	public void showPhoneInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번화 : " + phoneNumber);
		if(birthday!=null)
			System.out.println("생년월일 : "+ birthday);
	}
}

public class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneInfo info1 = new PhoneInfo("김철수", "010-1111-1111", "2000년1월1일");
		PhoneInfo info2 = new PhoneInfo("김영희", "010-2222-2222", "2000년12월31일");
		info1.showPhoneInfo();
		info2.showPhoneInfo();
	}
}
