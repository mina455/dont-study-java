package inheritance01_14;

class Man {
	private String name;
	public Man(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinesMan extends Man {
	private String company;
	private String position;

	public BusinesMan(String name, String company, String position) {
		super(name); //상위 클래스의 생성자 호출문
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

class BasicInheritance {
	public static void main(String[] args) {
		BusinesMan man1 = new BusinesMan("Mr.Hong", "Hybrid 3D ELD", "Staff Eng.");
		BusinesMan man2 = new BusinesMan("Mr.Lee", "Hybrid 3D ELD", "Assist Eng.");

		System.out.println("First man info...............");
		man1.tellYourName();
		man1.tellYourInfo();
		System.out.println("Second man info...............");
		man2.tellYourInfo();

	}

}
