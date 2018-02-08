package staticVariable_10;

class InstCnt {
	/**
	 * static변수(클래스 변수)는 
	 * 선언된 클래스의 모든 인스턴스가 공유하는 변수 
	 * 
	 * 즉, 인스턴스 간에 데이터 공유가 필요한 상황에서는 static변수를 선언한다!!
	 */
	int intNum = 0;
	static int instNum = 0;
	
	public InstCnt() {
		intNum++;
		instNum++;
		System.out.println("intNum = "+intNum); 
		System.out.println("instNum = "+instNum); 
	}
}

class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt(); //intNum = 1, instNum = 1
		InstCnt cnt2 = new InstCnt(); //intNum = 1, instNum = 2
		InstCnt cnt3 = new InstCnt(); //intNum = 1, instNum = 3
	}

}
