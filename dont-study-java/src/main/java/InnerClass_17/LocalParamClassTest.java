package InnerClass_17;

class OuterClass03 {
	private String myName;

	OuterClass03(String name) {
		myName = name;
	}

	public Readable createLocalClassInst(final int instID) {
		class LocalClass implements Readable {
			public void read() {
				System.out.println("Outer inst name : " + myName);
				System.out.println("Local inst ID : " + instID);
			}
		}
		return new LocalClass();
	}

}

class LocalParamClassTest {
	public static void main(String[] args) {
		OuterClass03 out = new OuterClass03("My Outer Class");
		Readable localInst1 = out.createLocalClassInst(111);
		localInst1.read();

		Readable localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}

}
