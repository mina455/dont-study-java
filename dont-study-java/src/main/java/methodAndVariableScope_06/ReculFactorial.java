package methodAndVariableScope_06;

public class ReculFactorial {
	public static void main(String[] args) {
		System.out.println("3 factorial: "+factorial(3));
	}

	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*factorial(n-1);
			/* 메모리에 저장된 메소드를 구성하는 명령문이 CPU로 이동해서 실행.
			 *
			 * 메소드를 구성하는 명령문은 얼마든지 CPU로 이동해서 실행이 가능하므로
			 * 기존에 호출된 메소드가 완료되지 않았다고 해서 호출이 불가능한 것이 아님.
			 * 메소드의 앞 부분을 구성하는 명령문만 반복해서 CPU로 이동시킬 수 있기 때문이다.
			 * */
		}
	}

}
