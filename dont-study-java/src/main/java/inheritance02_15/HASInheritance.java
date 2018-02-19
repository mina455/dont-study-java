package inheritance02_15;

class Gun {
	int bullet;

	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shut() {
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police extends Gun {
	int handcuffs;

	public Police(int bnum, int bcuff) {
		super(bnum);
		handcuffs = bcuff;
	}

	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
}

class HASInheritance {
	public static void main(String[] args) {
		Police pman = new Police(5, 3); //총알 5, 수갑 3
		pman.shut();
		pman.putHandcuff();
	}

}
