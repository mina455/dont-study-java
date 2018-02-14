package Array_13;

class MainParam {
	public static void main(String[] args) {

		/**
		 * for-each문을 사용해서 좋을 대표적인 상황
		 * 배열의 길이를 알 필요도 없으니 문장의 구성이 매우 용이하다.
		 */
		for (String e : args) {
			System.out.println(e);
		}
	}

}
