package collectionFramework_22;

import java.util.ArrayList;

class IntroArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		/*데이터 저장*/
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));

		/*데이터 참조*/
		System.out.println("1차 참조");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/*데이터 삭제*/
		list.remove(0); //0이 전달되었으므로 첫번째 데이터 삭제
		System.out.println("2차 참조");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

/**
 * ArrayList<E>
 * 내부적으로 배열을 이용해서 인스턴스의 참조 값을 저장
 *
 * 단점
 * 1.저장소의 용량을 늘리는 과정에서 많은 시간이 소요됨
 * 2.데이터의 삭제에 필요한 연산과정이 매우 길다.
 *
 * 장점
 * 1.데이터의 참조가 용이해서 빠른 참조 가능.
 *
 */


