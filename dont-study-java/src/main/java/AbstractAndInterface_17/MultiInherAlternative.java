package AbstractAndInterface_17;

class TV02 {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer02 {
	public void dataReceive();
}

class ComputerImpl {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV02 extends TV02 implements Computer02 {
	ComputerImpl comp = new ComputerImpl();

	public void dataReceive() {
		comp.dataReceive();
	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

class MultiInherAlternative {
	public static void main(String[] args) {
		IPTV02 iptv = new IPTV02();
		iptv.powerOn();

		TV02 tv = iptv;
		Computer02 comp = iptv;
	}

}
