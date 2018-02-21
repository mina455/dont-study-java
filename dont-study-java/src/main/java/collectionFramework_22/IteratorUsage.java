package collectionFramework_22;

import java.util.Iterator;
import java.util.LinkedList;

class IteratorUsage {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");

		Iterator<String> itr = list.iterator();

		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		while(itr.hasNext()) {
			String curStr = itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0) //compareTo 메소드는 문자열 비교로 값이 같으면 '0'을 반환
				itr.remove(); //remove 메소드가 호출되기 바로 직전에 next 메소드에 의해 반환된 데이터가 삭제
		}

		System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력 ");
		itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
