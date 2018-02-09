package methodOverloadingAndStringClass_11;

public class StringCopy {
	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = "Lemon";
		String str3 = new String(str2);

		// 동일한 문자열을 구성했기 때문에 같은 주소 참조
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");

		// st3은 새로운 주소값을 생성
		if(str2 == str3)
			System.out.println("str2과 str3는 동일 인스턴스 참조");
		else
			System.out.println("str2과 str3는 다른 인스턴스 참조");
	}

}
