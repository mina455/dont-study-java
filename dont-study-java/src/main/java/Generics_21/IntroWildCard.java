package Generics_21;

class Fruit {
	public void showYou() {
		System.out.println("난 과일이다");
	}
}

class Apple2 extends Fruit {
	public void showYou() {
		super.showYou();
		System.out.println("난 붉은 과일이다.");
	}
}

class FruitBox3<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

class IntroWildCard {

	/**
	 * 메소드의 매개변수가 FruitBox3<? extends Fruit> 로 선언되었다.
	 * 이는 Fruit 또는 Fruit을 상속하는 클래스의 이름이 전달되어 생성되는 FruitBox3<T>의
	 * 인스턴스는 무엇이든 이 메소드의 인자로 전달될 수 있다.
	 *
	 * 반대로 extends 대신 super가 들어가면 super 뒤에 오는 클래스가 상속하는 클래스라면 무엇이든...
	 */
	public static void openAndShowFruitBox3(FruitBox3<? extends Fruit> box) {
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}

	public static void main(String[] args) {
		FruitBox3<Fruit> box1 = new FruitBox3<Fruit>();
		box1.store(new Fruit());

		FruitBox3<Apple2> box2 = new FruitBox3<Apple2>();
		box2.store(new Apple2());

		openAndShowFruitBox3(box1);
		openAndShowFruitBox3(box2);
	}

}
