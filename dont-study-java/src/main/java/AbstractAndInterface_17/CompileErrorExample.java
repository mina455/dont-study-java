package AbstractAndInterface_17;

class TV {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

class Computer {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

/**
 * 자바는 다중상속을 지원하지 않기 때문에 컴파일 오류 발생
 *
 */
class IPTV extends TV, Computer {
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

class CompileErrorExample {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV tv = iptv;
		Computer comp = iptv;
	}

}
