package collectionFramework_22;

import java.util.LinkedList;

class IntroLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

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
 * LinkedList<E>
 * 서로서로 연결하는 방식으로 데이터 저장
 *
 * 단점
 * 1.데이터의 참조가 다소 불편
 *
 * 장점
 * 1.저장소의 용량을 늘리는 과정이 간단
 * 2.데이터의 삭제가 매우 간단
 *
 */

