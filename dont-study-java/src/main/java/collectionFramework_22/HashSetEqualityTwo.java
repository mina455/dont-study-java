package collectionFramework_22;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNnmber2 {
	int num;
	public SimpleNnmber2(int n) {
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
	}
	public int hashCode() {
		return num%3;
	}
	public boolean equals(Object obj) {
		SimpleNnmber2 comp = (SimpleNnmber2)obj;
		if(comp.num==num)
			return true;
		else
			return false;
	}
}

class HashSetEqualityTwo {
	public static void main(String[] args) {
		HashSet<SimpleNnmber2> hset = new HashSet<SimpleNnmber2>();
		hset.add(new SimpleNnmber2(10));
		hset.add(new SimpleNnmber2(20));
		hset.add(new SimpleNnmber2(20));

		System.out.println("저장된 데이터 수 : " + hset.size());

		Iterator<SimpleNnmber2> itr = hset.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
