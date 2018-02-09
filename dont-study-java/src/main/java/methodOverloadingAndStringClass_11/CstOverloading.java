package methodOverloadingAndStringClass_11;

/**
 * this 키워드
 * 생성자 내에 한정해서 오버로딩 된 다른 생성자의 호출을 허용한다.
 *
 */
class CstPerson {
	private int perID;
	private int milID;
	private int birthYear;
	private int birthMonth;
	private int birthDay;

	public CstPerson(int perID, int milID, int bYear, int bMonth, int bDay) {
		// 생성자 내에서는 클래스 내에 정의되어 있는 모든 인스턴스 변수를 초기화한다.
		this.perID = perID; // 매개변수명랑 인스턴스명이 같을 땐 this 이용
		this.milID = milID; // this는 인스턴스 자신을 의미.
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}

	public CstPerson(int pID, int bYear, int bMonth, int bDay) {
		// 오버로딩 된 다른 생성자의 호출을 요구하는 문장.
		// 위 정의 된 생성자가 추가로 호출된다.
		this(pID, 0, bYear, bMonth, bDay);
	}

	public void showInfo() {
		System.out.println("민번:"+perID);
		System.out.println("생년월일:"+birthYear+birthMonth+birthDay);
		if(milID!=0)
			System.out.println("군번:"+milID+'\n');
		else
			System.out.println("군번 관계 없음 \n");
	}
}

public class CstOverloading {
	public static void main(String[] args) {
		CstPerson man = new CstPerson(951203, 880102, 1995, 12, 3);
		CstPerson woman = new CstPerson(991107, 1999, 11, 7);
		man.showInfo();
		woman.showInfo();
	}

}
