package methodOverloadingAndStringClass_11;

public class BuilderString {

	public static void main(String[] args) {
		StringBuilder strBuf = new StringBuilder("AB");
		strBuf.append(25);
		strBuf.append('Y').append(true);
		System.out.println(strBuf);

		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(),'z');
		System.out.println(strBuf);
	}
}

/**
 * StringBuilder는 문자열의 저장 및 변경을 위한 메모리(버퍼)을 내부에 지니는데
 * 이 메모리 공간은 그 크기가 자동으로 조정된다는 특징이 있다.
 *
 * public StringBuilder() //16개의 문자 저장 버퍼 생성
 * public StringBuilder(int capacity) //capacity개의 문자 저장 버퍼 생성
 * public StringBuilder(String str) //str.length() + 16개의 문자 저장 버퍼 생성
 *
 * StringBuffer 클래스와 StringBuilder 클래스의 공통점
 * - 메소드의 수(생성자 포함)
 * - 메소드의 기능
 * - 메소드의 이름과 매개변수 형
 *
 * StringBuffer 클래스와 StringBuilder 클래스의 차이점
 * StringBuffer는 쓰레드에 안전
 * StringBuilder는 쓰레드에 안전하지 못함
 *
 */
