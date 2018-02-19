package InnerClass_17;

class OuterClassOne {
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}

	/**
	 * Nested 클래스  == Inner 클래스
	 *
	 * Nested 클래스는 Outer 클래스의 static 멤버에 직접 접근이 가능하다는 특징이 있음.
	 *
	 */
	static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo {
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}

	private static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method Two");
		}
	}
}

class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();

		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
	}

}
