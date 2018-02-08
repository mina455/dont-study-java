package AccessControlSpecifiers_09;


class SinivelCap { //콧물 처치용 캡슐
	public void take() {
		System.out.println("콧물이 싹~ 납니다.");
	}
}

class SneezeCap {
	public void take() {
		System.out.println("재채기가 맞습니다.");
	}
}

class SnuffleCap {
	public void take() {
		System.out.println("코가 뻥 뚫립니다.");
	}
}

class ColdPatient {
	public void takeSiniveCap(SinivelCap cap) {
		cap.take();
	}
	public void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	public void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
}

class Encapsulation1 {
	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		/**
		 * 인스턴스가 생성이 되면 생성된 인스턴스의 주소 값이 반환됨
		 *
		 * 인스턴스 생성 후 반환되는 주소 값을 인자로 전달하여,
		 * 참조변수로 선언되어 있는 매개변수를 초기화한다.
		 */
		sufferer.takeSiniveCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
	}

}
