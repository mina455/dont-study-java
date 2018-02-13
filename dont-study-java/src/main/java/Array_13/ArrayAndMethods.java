package Array_13;

class ArrayAndMethods {


	/**
	 * addAllArray는 int형 1차원 배열의 참조값을 전달받고 반환하는 메소드이기 때문에
	 * 매개변수형과 반환형이 둘 다 int[]으로 선언되었다.
	 */
	public static int[] addAllArray(int[] ar, int addVal) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += addVal;
		}
		return ar;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ref;

		ref = addAllArray(arr, 7);

		if(arr==ref)
			System.out.println("동일 배열 참조");
		else
			System.out.println("다른 배열 참조");

		/**
		 * 배열의 길이는 참조변수 ref로 구하고, 출력은 참조변수 arr을 이용해서 진행
		 * 이는 ref와 arr이 동일한 배열 인스턴스를 참조하고 있음을 강조하기 위한 코드
		 */
		for (int i = 0; i < ref.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
