package AbstractAndInterface_17;

interface PersonalNumberStorage02 {
	void addPersonalInfo(String name, String perNum);
	String searchName(String perNum);
}

class PersonalNumInfo02 {
	String name;
	String number;

	PersonalNumInfo02(String name, String number) {
		this.name=name;
		this.number=number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
}

class PersonalNumberStorageImpl02 implements PersonalNumberStorage02 {
	PersonalNumInfo02[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl02(int sz) {
		perArr = new PersonalNumInfo02[sz];
		numOfPerInfo=0;
	}

	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo02(name, perNum);
		numOfPerInfo++;
	}

	public String searchName(String perNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}
		return null;
	}
}

public class AbstractInterface2 {
	public static void main(String[] args) {
		PersonalNumberStorage02 storage = new PersonalNumberStorageImpl02(100);
		storage.addPersonalInfo("김기동",	"950000-1122333");
		storage.addPersonalInfo("장산길",	"970000-1122334");

		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}

}
