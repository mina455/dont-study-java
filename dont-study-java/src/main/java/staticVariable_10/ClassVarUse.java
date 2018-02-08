package staticVariable_10;

/**
 * final 상수화 : 변경되지 않는 값에 선언
 * 변경이 되지 않으면서 참조의 용도로만 선언되는 변수는 static final 로 선언하는 것이 적절하다
 * 
 * 즉, 클래스 내부 또는 외부에서 참조의 용도로만 선언된 변수는 static final로 선언한다.
 *
 */
class Circle { 
	// PI는 어차피 상수로 선언되어 접근지시자 private를 붙이지 않았다.
	static final double PI=3.1415;
	private double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	public void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레 : "+ peri);
	}
	public void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이 : "+area);
	}
}

public class ClassVarUse {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.2);
		c1.showPerimeter();
		c1.showArea();
	}

}
