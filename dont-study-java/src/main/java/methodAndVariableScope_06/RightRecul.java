package methodAndVariableScope_06;

public class RightRecul {
	public static void main(String[] args) {
		showHi(3);
	}

	public static void showHi(int cnt) {
		System.out.println("Hi!");
		if(cnt==1)
			return;
		showHi(--cnt);
	}

	/* 재귀 메소드 정의의 주의사항!!!
	 * 1.재귀의 연결 고리를 끊기 위한 조건검사의 위치가 적절해야함
	 * 2.재귀의 연결 고리를 끊기 위한 조건검사가 true가 되도록 적절한 연산이 이뤄져야함
	 *
	 * 빈번한 메소드의 호출이 문제가 될 수 있음(재귀 메소드 사용시)
	 *
	 * 그럼에도 재귀 메소드의 장점은
	 * 1.재귀적 사고는 복잡한 문제를 간결하게 해결하는 열쇠가 된다.
	 * 2.수백 줄 이상의 코드가 요구되는 문제를 불과 수십 줄의 코드로 해결할 수 있다
	 * */

}
