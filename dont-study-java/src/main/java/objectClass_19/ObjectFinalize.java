package objectClass_19;

class MyName {
	String objName;
	public MyName(String name) {
		objName = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 *
	 * Object 클래스의 finalize 메소드를 오버로딩함.
	 * 따라서 이 메소드는 인스턴스 소멸 시 자동으로 호출될 것으로 기대할 수 있다.
	 *
	 * 하지만....
	 * 가비지 컬렉션이 한번도 발생하지 않아 finalize 메소드가 호출되지 않았다
	 * 때문에 명시적으로 가비지 컬렉션을 수행기켜야 한다.
	 * System.gc();
	 * System.runFinalization();
	 */
	protected void finalize() throws Throwable {
		super.finalize(); //Object 클래스의 finalize 메소드 호출
		System.out.println(objName + "이 소멸되었습니다.");
	}
}

public class ObjectFinalize {
	public static void main(String[] args) {
		MyName obj1 = new MyName("인스턴스1");
		MyName obj2 = new MyName("인스턴스2");
		obj1 = null;
		obj2 = null;

		System.out.println("프로그램을 종료합니다.");
		//System.gc();
		//System.runFinalization();
	}
}
