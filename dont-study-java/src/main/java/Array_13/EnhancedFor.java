package Array_13;

class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		int sum = 0;
		/**
		 * for-each문
		 * arr : 반복의 대상(배열의 이름)
		 * int e : 배열 arr의 모든요소 각각(배열 요소를 지칭하는 변수)
		 */
		for(int e : arr)
			sum += e;

		System.out.println("배열 요소의 합 : " + sum);

		for (int e : arr) {
			e++;
			System.out.print(e + " ");
		}

		System.out.println("");
		for (int e : arr) {
			System.out.print(e+" ");
		}
	}

}
