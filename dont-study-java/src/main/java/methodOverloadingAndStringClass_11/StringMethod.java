package methodOverloadingAndStringClass_11;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = str1.concat(str2).concat(str3);

		System.out.println(str4);
		System.out.println("문자열 길이 : "+str4.length());
		//str1을 기준으로 str3이 사전편찬 순서상
		// 앞에 위치하면 0보다 작은값, 뒤에 위치하면 0보다 큰값이 반환
		if(str1.compareTo(str3)<0)
			System.out.println("str1이 앞선다.");
		else
			System.out.println("str3이 앞선다");
	}
}

/**
 * 문자열 복사
 * String str1 = "Best String";
 * String str2 = new String(str1);
 *
 */

