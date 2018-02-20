package basicClass_20;

import java.math.BigDecimal;

class NoErrorBigDecimal {
	public static void main(String[] args) {
		BigDecimal e1 = new BigDecimal("1.6"); //오차 없는 실수 표현 및 연산을 위한 문자열 이용
		BigDecimal e2 = new BigDecimal("0.1");

		System.out.println("두 실수의 덧셈결과 : " + e1.add(e2));
		System.out.println("두 실수의 곱셈결과 : " + e1.multiply(e2));
	}

}
