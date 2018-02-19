package inheritance02_15;

class AAA {
	public void rideMethod() {
		System.out.println("AAA is Method");
	}

	public void loadMethod() {
		System.out.println("void Method");
	}
}

class BBB extends AAA {
	public void rideMethod() {
		System.out.println("BBB is Method");
	}

	public void loadMethod(int num) {
		System.out.println("int Method");
	}
}

class CCC extends BBB {
	public void rideMethod() {
		System.out.println("CCC is Method");
	}

	public void loadMethod(double num) {
		System.out.println("double Method");
	}
}

class RideAndLoad {
	public static void main(String[] args) {
		AAA ref1 =new CCC();
		BBB ref2 =new CCC();
		CCC ref3 =new CCC();

		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();

		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
	}

}
