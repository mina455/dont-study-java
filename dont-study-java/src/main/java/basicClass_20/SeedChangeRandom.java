package basicClass_20;

import java.util.Random;

class SeedChangeRandom {

	public static void main(String[] args) {
		Random rand = new Random(12);
		rand.setSeed(System.currentTimeMillis());
		/**
		 * System.currentTimeMillis()
		 * 컴퓨터의 현재시간 기준으로 1970년 1월 1일 자정 이후로 지나온 시간을
		 * 밀리 초(1/1000초)단위로 계산해서 반환하는 메소드
		 *
		 */

		for (int i = 0; i < 100; i++) {
			System.out.println(rand.nextInt(1000));
		}
	}
}
