package ten;


class Outer1 {
	class Inner {
		int iv=100;
	}
}

class Exercise10_1 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner i = o.new Inner();
		System.out.println(i.iv);
	}
}
