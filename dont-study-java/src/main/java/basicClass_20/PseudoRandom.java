package basicClass_20;

import java.util.Random;

class PseudoRandom {
	public static void main(String[] args) {
		Random rand = new Random(12);
		/**
		 * Random 클래스의 인스턴스 생성과정에서 생성자에 정수 12를 전달하고 있다.
		 * 이 값은 난수를 생성하는 과정에 있어서 씨앗으로 사용된다.
		 * 컴퓨터에서 생성하는 난수는 근거 또는 재료가 되는 하나의 숫자를 기반으로 만들어지도록 알고리즘이 설계되어 있다.
		 * 따라서 이 숫자를 가리켜 씨앗 값 또는 씨드 값이라 한다.
		 *
		 * 씨앗이 같으면 생성되는 난수는 100% 동일(값&순서)
		 *
		 * 즉, 컴퓨터가 생성하는 난수는 '가짜난수'
		 *
		 */


		for (int i = 0; i < 100; i++) {
			System.out.println(rand.nextInt(1000));
		}
	}

}
