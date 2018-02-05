package methodAndVariableScope_06;

public class LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		if(scope) {
			int num = 1;
			num++;
			System.out.println(num);
		} else {
			int num = 2;
			System.out.println(num);
		}
		simple();
	}

	public static void simple() {
		int num = 3;
		System.out.println(num);
	}

	/* 동일한 변수명을 다수 선언 할 수 있는 이유는
	 * 선언된 변수가 속하는 중괄호의 영역(스코프)가 다르기 때문이다
	 * */

	/* 지역변수는 선언된 지역을 벗어나 버리면
	 * 메모리 공간에서 소멸됨!! (자동 소멸!)
	 * */

}
