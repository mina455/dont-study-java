package inheritance02_15;

class Gun02 {
	int bullet;

	public Gun02(int bnum) {
		bullet = bnum;
	}
	public void shut() {
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police02 {
	int handcuffs;
	Gun pistol; //소유하고 있는 권총

	/**
	 * Gun클래스 상속이 아닌 생성자에서 Gun클래스의 인스턴스를 생성해서 이를 참조하고 있다.
	 */
	public Police02(int bnum, int bcuff) {
		handcuffs = bcuff;
		if(bnum!=0) {
			pistol = new Gun(bnum);
		} else {
			pistol =null;
		}
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}

	/**
	 * Gun클래스를 상속한다면 shut메소드를 별도로 정의할 필요가 없다.
	 * 그러나 인스턴스 멤버로 두었기 때문에 별도의 메소드가 정의되어야 한다.
	 */
	public void shut() {
		if(pistol==null) {
			System.out.println("Hut BBANG!");
		} else {
			pistol.shut();
		}
	}
}

class HASComposite {
	public static void main(String[] args) {
		Police02 haveGun = new Police02(5, 3);
		haveGun.shut();
		haveGun.putHandcuff();

		Police02 dontHaveGun = new Police02(0, 3);
		dontHaveGun.shut();
	}

}
