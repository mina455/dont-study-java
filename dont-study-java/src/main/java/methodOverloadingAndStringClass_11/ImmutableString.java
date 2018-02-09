package methodOverloadingAndStringClass_11;

/**
 * 자바는 인스턴스 생성의 수를 줄이기 위해
 * 동일한 문자열 데이터로 구성되는 String 인스턴스의 생성을 하나로 제한한다.
 * 그리고 이를 통한 문제의 발생을 막기 위해
 * String 인스턴스의 데이터 변경은 허용하지 않는다.
 *
 */
public class ImmutableString {
	public static void main(String[] args) {
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "Your String";

		if (str1 == str2) // == 참조값 비교
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");

		if (str2 == str3)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");

	}

}
