package collectionFramework_22;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNnmber {
	int num;
	public SimpleNnmber(int n) {
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
		//String 클래스의 static 메소드인 valueOf는
		//기본 자료형 데이터를 String 인스턴스로 변환해준다
	}
}

class HashSetEqualityOne {
	public static void main(String[] args) {
		HashSet<SimpleNnmber> hset = new HashSet<SimpleNnmber>();
		hset.add(new SimpleNnmber(10));
		hset.add(new SimpleNnmber(20));
		hset.add(new SimpleNnmber(20));

		System.out.println("저장된 데이터 수 : " + hset.size());

		Iterator<SimpleNnmber> itr = hset.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
