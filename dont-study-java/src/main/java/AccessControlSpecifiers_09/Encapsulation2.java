package AccessControlSpecifiers_09;

/**
 * Encapsulation1.java에 있는
 * SinivelCap, SneezeCap, SnuffleCap 클래스 이용
 */
class CONTAC600 { //캡슐화(관련있는 메소드와 변수를 하나의 클래스로 묶음)
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;

	public CONTAC600() {
		sin = new SinivelCap();
		sne = new SneezeCap();
		snu = new SnuffleCap();
	}

	public void take() {
		sin.take();
		sne.take();
		snu.take();
	}
}

class ColdPatient2 {
	public void takeCONTAC600(CONTAC600 cap) {
		cap.take();
	}
}

class Encapsulation2 {
	public static void main(String[] args) {
		ColdPatient2 sufferer = new ColdPatient2();
		sufferer.takeCONTAC600(new CONTAC600());
	}

}

/**
 * 정보를 은닉시키기는 쉽다. 그러나 캡슐화는 어렵다.
 *
 * 경험 많은 객체지향 프로그래머를 구분하는 첫 번째 기준은 캡슐화이다.
 *
 * 캡슐화에는 정보은닉이 기본적으로 포함된다.
 * 이와이면 인스턴스 변수가 보이지 않게 정보를 은닉해서 감싸는 것이 좋다.
 *
 */

