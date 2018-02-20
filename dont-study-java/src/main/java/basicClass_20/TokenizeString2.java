package basicClass_20;

import java.util.StringTokenizer;

class TokenizeString2 {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-997-1234";
		String javaCode = "num+=1";

		System.out.println("First Result...........");
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		//문자열 정보만 전달 될 뿐, 구분자의 정보가 없으면 스페이스바, \t, \n, \r 과 같은 공백을 기준으로 토큰이 나뉨
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());

		System.out.println("\nSecond Result...........");
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());

		System.out.println("\nThird Result...........");
		StringTokenizer st3 = new StringTokenizer(javaCode, "+=", true);
		//세번째 전달인자는 구분자를 토큰으로 간주하느냐 마느냐를 결정
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
	}

}
