package Array_13;

class Number {
	public int num;
	public Number(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}

class EnhancedForInst {

	public static void main(String[] args) {
		Number[] arr = new Number[] {
				new Number(2),
				new Number(4),
				new Number(8)
		};

		for (Number e : arr) {
			e.num++;
		}

		for (Number e : arr) {
			System.out.print(e.getNum()+" "); // 3 5 9
		}

		System.out.println("");

		for (Number e : arr) {
			e = new Number(5);
			e.num+=2;
			System.out.print(e.getNum()+" "); // 7 7 7
		}

		System.out.println("");

		// 배열의 참조변수를 위해 선언된 변수 e는 for-each문 내에서만 유효하다.
		for (Number e : arr) {
			System.out.print(e.getNum()+" "); // 3 5 9
		}
	}
}
