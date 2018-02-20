package Generics_21;

class Orange3{
	int sugarContent;
	public Orange3(int sugar) {
		sugarContent = sugar;
	}
	public void showSugarContent() {
		System.out.println("당도 " + sugarContent);
	}
}

class Apple {
	int weight;
	public Apple(int weight) {
		this.weight = weight;
	}
	public void showAppleWeight() {
		System.out.println("무게 " + weight);
	}
}

class FruitBox2<T> { // T라는 이름이 매개변수화 된 자료형임을 나타냄.
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

class GenericBaseFruitBox {
	public static void main(String[] args) {
		FruitBox2<Orange3> orBox = new FruitBox2<Orange3>();
		orBox.store(new Orange3(10));
		Orange3 org = orBox.pullOut();
		org.showSugarContent();

		FruitBox2<Apple> apBox = new FruitBox2<Apple>();
		apBox.store(new Apple(10));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
	}

}
