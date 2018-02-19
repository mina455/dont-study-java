package inheritance02_15;

class AAAA {
	public int num = 2;
}

class BBBB extends AAAA {
	public int num = 5;
	public void showSuperNum() {
		System.out.println("AAAA's num : " +super.num);
	}
}

class CCCC extends BBBB {
	public int num = 7;
	public void showAllNums() {
		super.showSuperNum(); //super 생략가능
		System.out.println("BBBB's num : " +super.num);
		System.out.println("CCCC's num : " +num);
	}
}

class ShowAllReDecl {
	public static void main(String[] args) {
		CCCC ref = new CCCC();
		ref.showAllNums();
	}

}
