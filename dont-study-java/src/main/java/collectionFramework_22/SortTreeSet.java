package collectionFramework_22;

import java.util.Iterator;
import java.util.TreeSet;

class SortTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);

		System.out.println("저장된 데이터 수 : " +sTree.size());

		Iterator<Integer> itr = sTree.iterator();
		// iterator 메소드가 반환하는 반복자는 정렬된 데이터를 오름차순으로 참조한다.

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
