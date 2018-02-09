package methodOverloadingAndStringClass_11;

/**
 * 메소드 오버로딩 :
 * 이름은 동일하지만 매개변수의 선언형태를 다르게 정의한는 것.
 *
 * 단, 반환형이 다른것은 메소드 오버로딩이 안됨.
 * int isYourFunc(int n){...}
 * boolean isYourFunc(int n){...}
 *
 * 자바는 생성자의 오버로딩도 지원합니다.
 * 아래 예를 참고.
 */
class Person {
	private int perID;
	private int milID;

	public Person(int pID, int mID) {
		perID = pID;
		milID = mID;
	}

	public Person(int pID) {
		perID = pID;
		milID = 0;
	}

	public void showInfo() {
		System.out.println("민번:"+perID);
		if(milID!=0)
			System.out.println("군번:"+milID+'\n');
		else
			System.out.println("군번 관계 없음 \n");
	}
}

public class Overloading {
	public static void main(String[] args) {
		Person man = new Person(950123, 880102);
		Person woman = new Person(941125);
		man.showInfo();
		woman.showInfo();
	}

}
