package AbstractAndInterface_17;

interface UpperCasePrintable {
	// 비어있음.
}

class ClassPrinter02 {
	public static void print(Object obj) {
		String org = obj.toString();
		if(obj instanceof UpperCasePrintable) {
			org = org.toUpperCase();
		}
		System.out.println(org);
	}
}

class PointOne implements UpperCasePrintable {
	private int xPos, yPos;

	PointOne(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		String posInfo = "[x : " + xPos + ", y : " + yPos + "]";
		return posInfo;
	}
}
class PointTwo {
	private int xPos, yPos;

	PointTwo(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		String posInfo = "[x : " + xPos + ", y : " + yPos + "]";
		return posInfo;
	}
}

class InterfaceMark {
	public static void main(String[] args) {
		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);

		ClassPrinter02.print(pos1);
		ClassPrinter02.print(pos2);
		ClassPrinter02.print(pos3);
		ClassPrinter02.print(pos4);
	}

}
