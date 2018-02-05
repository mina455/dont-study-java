package methodAndVariableScope_06;

public class InfRecul {
	public static void main(String[] args) {
		showHi(3);
	}

	//잘못 정의된 재귀 메소드
	public static void showHi(int cnt) {
		System.out.println("Hi!");
		showHi(cnt--);
		if(cnt==1)
			/* 만족 불가능.
			 * 이유는 위 -- 연산자가 뒤에 붙어 cnt가 줄지 않음
			 * 조건 검사는 재귀 메소드가 호출되기 이전에 이뤄져야함!!!!
			 * */
			return;
	}

}
