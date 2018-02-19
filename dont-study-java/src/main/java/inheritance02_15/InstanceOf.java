package inheritance02_15;

class Box {
	public void simpleWrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("gold wrap");
	}
}

class InstanceOf {

	public static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox) { //box를 GoldPaperBox형으로 형변환 가능여부 체크
			((GoldPaperBox)box).goldWrap();
		} else if (box instanceof PaperBox) { //box를 PaperBox형으로 형변환 가능여부 체크
			((PaperBox)box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}
	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

}
