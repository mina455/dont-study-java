package collectionFramework_22;

import java.util.HashSet;
import java.util.Iterator;

class SetInterfaceFeature {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("First");
		hset.add("Second");
		hset.add("Third");
		hset.add("Fourth");

		System.out.println("저장된 데이터 수 : " + hset.size());

		Iterator<String> itr = hset.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
