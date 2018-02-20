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
