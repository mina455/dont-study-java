package Generics_21;

public class BoundedTypeParam2 {
	public static <T extends SimpleInterface> void showInstanceAncestor(T param) {
		param.showYourName();
	}
	public static <T extends UpperClass> void showInstanceName(T param) {
		param.showYourAncestor();
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
