package staticVariable_10;

/**
 * static변수의 초기화 시점 :
 * static변수가 초기화되는 시점은 JVM에 의해서 클래스가 메모리 공간에 올라가는 순간이다
 * 때문에, static변수를 생성자를 통해서 초기화하는 실수를 해서는 안 된다.
 * 만약 생성자를 통해서 초기화를 하면 인스턴스가 생성될 때마다 새로운 값이 대입되는 꼴이 된다.
 * 
 * 인스턴스가 생성되기 이전에 별도의 메모리 공간에 할당되어 초기화까지 완료
 *
 */
class InstCnt2 { 
	static int instNum = 100;
	
	public InstCnt2() {
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

class StaticValNoInst {
	public static void main(String[] args) {
		//인스턴스 생성없이 static변수에 접근
		InstCnt2.instNum-=15;
		System.out.println(InstCnt2.instNum);
	}

}
