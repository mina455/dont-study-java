package methodAndVariableScope_06;

public class OnlyExitReturn {
	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}

	/* return의 두가지 의미
	 * 값의 반환
	 * 메소드의 종료
	 * */
	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로는 값을 나눌 수 없습니다.");
			return; // 값을 반환하지 않고 단순히 이 메소드를 종료하겠다
		}
		System.out.println("나눗셈 결과: "+(num1/num2));
	}

}
