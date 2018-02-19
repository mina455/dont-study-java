package InnerClass_17;

interface Readable {
	public void read();
}

class OuterClass02 {
	private String myName;

	OuterClass02(String name) {
		myName = name;
	}

	public Readable createLocalClassInst() {
		class LocalClass implements Readable {
			public void read() {
				System.out.println("Outer inst name : " + myName);
			}
		}
		return new LocalClass();
	}

}

class LocalClassTest {
	public static void main(String[] args) {
		OuterClass02 out1 = new OuterClass02("First");
		Readable localInst1 = out1.createLocalClassInst();
		localInst1.read();

		OuterClass02 out2 = new OuterClass02("Second");
		Readable localInst2 = out2.createLocalClassInst();
		localInst2.read();
	}

}

/**
 * Local 클래스는 Inner 클래스와 유사
 * 다만 메소드 내에 정의가 되고, 정의된 메소드 내에서만 인스턴스의 생성과 참조변수 선언이 가능
 *
 */