package Generics_21;

interface SimpleInterface {
	public void showYourName();
}

class UpperClass {
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA2 extends UpperClass implements SimpleInterface {
	public void showYourName() {
		System.out.println("Class AAA");
	}
}
class BBB2 extends UpperClass implements SimpleInterface {
	public void showYourName() {
		System.out.println("Class BBB");
	}
}

class BoundedTypeParam {

	public static <T> void showInstanceAncestor(T param) {
		((SimpleInterface)param).showYourName();
	}
	public static <T> void showInstanceName(T param) {
		((UpperClass)param).showYourAncestor();
	}

	public static void main(String[] args) {
		AAA2 aaa = new AAA2();
		BBB2 bbb = new BBB2();

		showInstanceAncestor(aaa);
		showInstanceName(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(bbb);
	}


}
