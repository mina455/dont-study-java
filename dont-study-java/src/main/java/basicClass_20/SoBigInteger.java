package basicClass_20;

import java.math.BigInteger;

class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);

		BigInteger bigValue1 = new BigInteger("1000000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-999999999999999999999999");
		// 반드시 문자열로 정보를 전달해야함.
		// 큰 수의 저장을 위한 정수 자료형이 없기 때문에 당연히 매개변수 선언이 불가능. 해서 문자열로 표현

		// BigInteger 인스턴스도 저장된 데이터의 변경이 불가하여 별도의 인스턴스 생성
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);

		System.out.println("큰 수의 덧셈 결과 : " + addResult);
		System.out.println("큰 수의 곱셈 결과 : " + mulResult);

	}

}
