package collectionFramework_22;

class Box<T> {

	//상자들은 연결하기 위한 참조변수.
	//이 변수를 이용해서 Box<T>의 인스턴스는 동일한 자료형의 인스턴스를 참조
	public Box<T> nextBox;
	T item;

	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

class SoSimpleLinkedListImpl {
	public static void main(String[] args) {
		Box<String> boxHead = new Box<String>();
		boxHead.store("First String");

		boxHead.nextBox = new Box<String>();
		boxHead.nextBox.store("Second String");

		boxHead.nextBox.nextBox = new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");

		Box<String> tempRef;

		/*두 번째 박스에 담긴 문자열 출력과정*/
		tempRef = boxHead.nextBox;
		System.out.println(tempRef.pullOut());

		/*세 번째 박스에 담긴 문자열 출력과정*/
		tempRef = boxHead.nextBox;
		tempRef = tempRef.nextBox;
		System.out.println(tempRef.pullOut());


	}

}

/**
 * 리스트 자료구조
 *
 */
