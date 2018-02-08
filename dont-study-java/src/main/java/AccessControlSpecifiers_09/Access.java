package AccessControlSpecifiers_09;

public class Access {

	/**
	 * 정보은닉과 Acces메소드
	 *
	 * 인스턴스 변수는 정보은닉의 대상.
	 * 외부에서 private로 선언된 변수에 간접접근을 허용하기 위해
	 * 추가적인 메소드를 제공. 이러한 유형의 메소드를 가리켜 'Access 메소드'라고함
	 *
	 * Access 메소드의 형태는 아래와 같다.(getter, setter)
	 */
	private int age;

	public void setAge(int ag) {
		age = ag;
	}
	public int getAge(int ag) {
		return ag;
	}

	/**
	 * private   - 클래스 내부
	 * default   - 클래스 내부 & 동일한 패키지
	 * protected - 클래스 내부 & 동일한 패키지 & 상속받은 클래스
	 * public    - 모든 영역
	 */

	/**
	 * 클래스를 public으로 선언 시 제야사항
	 *
	 * 1. 하나의 소스파일에는 하나의 클래스만 public으로 선언
	 * 2. public 클래스의 이름과 소스파일의 이름은 완전히 일치
	 */

	/**
	 * 일반적으로 메소드는 public으로 선언
	 *
	 */


}
