package InnerClass_17;

class OuterClass {
	private String myName;
	private int num;

	public OuterClass(String name) {
		myName = name;
		num = 0;
	}

	public void whoAreYou() {
		num++;
		System.out.println(myName + " OuterClass " + num);
	}

	class InnerClass {
		InnerClass() {
			whoAreYou();
		}
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("First");
		OuterClass out2 = new OuterClass("Second");
		out1.whoAreYou();
		out2.whoAreYou();

		OuterClass.InnerClass inn1 = out1.new InnerClass();
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
	}

}

/**
 * Outer 클래스의 인스턴스 생성 후에야 Inner 클래스의 인스턴스 생성이 가능하다
 * Inner 클래스 내에서는 Outer 클래스의 멤버에 직접 접근이 가능하다.
 * Inner 클래스의 인스턴스는 자신이 속할 Outer 클래스의 인스턴스를 기반으로 생성된다.
 *
 */