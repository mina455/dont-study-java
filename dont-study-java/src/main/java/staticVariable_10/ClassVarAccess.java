package staticVariable_10;

/**
 * static변수의 접근방법
 */
class AccessWay {
	
	static int num = 0;
	
	AccessWay() {
		incrCnt();
	}
	public void incrCnt() {
		num++; // 방법1. 클래스 내부(인스턴스 메소드 및 생성자)에서는 얼마든지 직접접근 가능.
	}
}

class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		way.num++; //방법2. 인스턴스명으로 접근 가능.
		AccessWay.num++; //방법3. 클래스명으로 접근 가능.
		// 방법2,3이 가능한 이유는 동일한 패키지 내 존재 & 변수 num의 접근제어 지시자가 default.
		System.out.println("num = "+ AccessWay.num);
	}
}

