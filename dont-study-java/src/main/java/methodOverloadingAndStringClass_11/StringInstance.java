package methodOverloadingAndStringClass_11;

public class StringInstance {
	public static void main(String[] args) {

		// String 클래스가 java.lang 패키지에 묶여있음을 보이기 위한 문자.
		java.lang.String str = "My name is Mina";

		int strLen1 = str.length();
		System.out.println("길이 1 : "+strLen1);

		int strLen2 = "한글의 길이는 어떻게?".length();
		System.out.println("길이 2 : "+strLen2);

	}

}
/**
 * 	(new AAA().bbb();
 *  위와 같이 인스턴스 생성 시 반환되는 참조 값을 바로 이용해 메소드를 호출할 수 있음.
 *
 *  String의 인스턴스에 저장된 문자열 데이터의 변경은 불가능해서 상수의 성격을 갖는다.
 *  String str = "Constant String";
 *  위와 같이 선언 후에는 문자열 데이터를 결코 바꿀 수 없다.
 *  바꾸는 메소드도 제공되지 않을 뿐더러, 문자열 데이터에 직접적인 접근도 불가능하기 때문.
 */
