package Generics_21;

class InstanceTypeShower2 {

	public <T, U> void showInstType(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

class IntroGenericMethod2 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();

		InstanceTypeShower2 shower = new InstanceTypeShower2();
		shower.<AAA, BBB>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);
	}

}