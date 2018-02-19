package AbstractAndInterface_17;

class ClassPrinter {
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}

class Point {
	private int xPos, yPos;

	Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	/*
	 * toString 메소드는 Object 클래스에 정의되어 있는 메소드이다.
	 * 그리고 Object 클래스는 모든 클래스가 상속하는 상위 클래스이다.
	 * 따라서 이는 Object 클래스에 정의되어 있는 메소드의 오버라이딩이다.
	 *
	 * @see java.lang.Object#toString()
	 *
	 */
	public String toString() {
		String posInfo = "[x : " + xPos + ", y : " + yPos + "]";
		return posInfo;
	}
}

class ImplObjectPrintln {
	public static void main(String[] args) {
		Point pos1 = new Point(1, 2);
		Point pos2 = new Point(5, 9);

		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
	}

}
