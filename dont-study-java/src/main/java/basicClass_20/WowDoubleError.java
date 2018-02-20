package basicClass_20;

import java.math.BigDecimal;

public class WowDoubleError {
	public static void main(String[] args) {
		BigDecimal e1 = new BigDecimal(1.6); //실수를 매개변수에 저장하여 오차 발생
		BigDecimal e2 = new BigDecimal(0.1);

		System.out.println("두 실수의 덧셈결과 : " + e1.add(e2));
		System.out.println("두 실수의 곱셈결과 : " + e1.multiply(e2));
	}

}
