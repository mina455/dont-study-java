package Generics_21;

class Orange2{
	int sugarContent;
	public Orange2(int sugar) {
		sugarContent = sugar;
	}
	public void showSugarContent() {
		System.out.println("당도 " + sugarContent);
	}
}

class OrangeBox {
	Orange2 item;
	public void store(Orange2 item) {
		this.item = item;
	}
	public Orange2 pullOut() {
		return item;
	}
}

public class ObjectBaseOrangeBox {

	public static void main(String[] args) {
		OrangeBox fBox1 = new OrangeBox();
		fBox1.store(new Orange2(10));
		Orange2 org1 = fBox1.pullOut();
		org1.showSugarContent();

		OrangeBox fBox2 = new OrangeBox();
		fBox2.store("오렌지"); //에러보임...
		Orange2 org2 = (Orange2)fBox2.pullOut(); //예외발생
		org2.showSugarContent();
	}
}
