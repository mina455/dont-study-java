package InnerClass_17;

class OuterClass04 {
	private String myName;

	OuterClass04(String name) {
		myName = name;
	}

	public Readable createLocalClassInst(final int instID) {
		return new Readable() {
			public void read() {
				System.out.println("Outer inst name : " + myName);
				System.out.println("Local inst ID : " + instID);
			}
		};
	}

}

class LocalParamAnonymous {
	public static void main(String[] args) {
		OuterClass04 out = new OuterClass04("My Outer Class");
		Readable localInst1 = out.createLocalClassInst(111);
		localInst1.read();

		Readable localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}

}

/**
 * Anonymous 클래스는 Local 클래스와 유사(Inner 클래스와도 유사)
 * 다만 Local 클래스는 이름이 있지만, Anonymous 클래스는 이름이 없다.
 *
 * Anonymous 클래스는 인터페이스의 메소드를 완성하는 방식으로 정의되기 때문에
 * 생성자가 필요한 상황에서는 어울리지 않는다. 그리고 실제로 이름이 없기 때문에 생성자를
 * 정의하고 싶어도 할수 없다.
 *
 */