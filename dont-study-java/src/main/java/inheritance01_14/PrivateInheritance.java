package inheritance01_14;

class Accumulator { //숫자를 누적하는 기능의 클래스
	private int val;
	Accumulator(int init) {
		val = init;
	}
	protected void accumulate(int num) {
		if(num<0) //음수는 누적 대상에서 제외
			return;
		val+=num;
	}
	protected int getAccVal() {
		return val;
	}
}

class SavingAccount extends Accumulator { //적금 통장을 표현한 클래스
	public SavingAccount(int initDep) { //적금 통장 개설 시 입금액
		super(initDep);
	}
	public void saveMoney(int money) { //돈의 입금
		accumulate(money);
	}
	public void showSaveMoney() {
		System.out.print("지금까지의 누적금액 : ");
		System.out.println(getAccVal());
	}
}

public class PrivateInheritance {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1000);
		sa.saveMoney(1000);
		sa.saveMoney(1000);
		sa.showSaveMoney();
	}

}
