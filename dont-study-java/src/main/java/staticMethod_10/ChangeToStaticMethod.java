package staticMethod_10;

class ChangeSimpleMath {
	public static final double PI = 3.1415;

	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	public static double min(double n1, double n2) {
		return n1 - n2;
	}
	public static double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class ChangeAreaMath {
	public static double calCircleArea(double rad) {

		double result = ChangeSimpleMath.mul(rad, rad);
		result = ChangeSimpleMath.mul(result, ChangeSimpleMath.PI);
		return result;
	}

	public static double calRectangleArea(double width, double height) {

		return ChangeSimpleMath.mul(width, height);
	}
}

class ChangePerimeterMath {
	public static double calCirclePeri(double rad) {

		double result = ChangeSimpleMath.mul(rad, 2);
		result = ChangeSimpleMath.mul(result, ChangeSimpleMath.PI);
		return result;
	}
	public static double calRectangPeri(double width, double height) {

		return ChangeSimpleMath.add(ChangeSimpleMath.mul(width, 2), ChangeSimpleMath.mul(height, 2));
	}
}

class ChangeToStaticMethod {
	public static void main(String[] args) {
		System.out.println("원의 넓이  : " + ChangeAreaMath.calCircleArea(2.4));
		System.out.println("직사각형 둘레  : " + ChangePerimeterMath.calRectangPeri(2.0, 4.0));
	}

}

/**
 * static메소드(클래스 메소드)는 인스턴스를 생성하지 않고 호출할 수 있다.
 *
 * 위 예제는 한 클래스의 모든 메소드를 static로 선언했는데,
 * 실제로 이러한 형태로 클래스를 정의하기도 한다. 그러나,
 * 한 클랫스 내에서 static 메소드와 인스턴스 메소드가 함께 정의되는 경우가 더 많다.
 *
 * static메소드 내에서는 static변수나 static메소드가 아닌,
 * 인스턴스 변수나 인스턴스 메소드 접근&호출이 불가능하다 ★★★★
 */

