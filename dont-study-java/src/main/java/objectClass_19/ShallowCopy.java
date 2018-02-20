package objectClass_19;

class Point2 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point2(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println("");
	}
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle implements Cloneable {
	Point2 upperLeft, lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point2(x1, y1);
		lowerRight = new Point2(x2, y2);
	}
	public void showPosition() {
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ShallowCopy {
	public static void main(String[] args) {
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {
			cpy = (Rectangle)org.clone();
			org.changePos(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
