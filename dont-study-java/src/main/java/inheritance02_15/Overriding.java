package inheritance02_15;

class Speaker {
	private int volumRate;

	public void showCurrentState() {
		System.out.println("볼륨 크기 : " + volumRate);
	}

	public void setVolum(int vol) {
		volumRate = vol;
	}
}

class BaseEnSpeaker extends Speaker {
	private int baseRate;

	public void showCurrentState() {
		/**
		 * super 키워드는 상위 클래스에 정의된 메소드의 호출에도 사용된다는 점을 반드시 기억하자.
		 */
		super.showCurrentState();
		System.out.println("베이스 크기 : " + baseRate);
	}

	public void setBaseRate(int base) {
		baseRate = base;
	}
}

class Overriding {
	public static void main(String[] args) {
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolum(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}
