package objectClass_19;

class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Hi my String");
		String str2 = new String("Hi my String");

		if (str1==str2) { //참조변수 비교
			System.out.println("참조 대상이 동일하다");
		} else {
			System.out.println("참조 대상이 동일하지 않다");
		}

		if (str1.equals(str2)) { //내용비교를 하도록 오버라이딩
			System.out.println("참조 대상이 동일하다");
		} else {
			System.out.println("참조 대상이 동일하지 않다");
		}
	}

}
