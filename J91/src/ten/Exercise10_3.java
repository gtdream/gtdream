package ten;
class Outer3 {
	int value=10;

	class Inner {
		int value=20;
		void method1() {
			int value=30;

			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

class Exercise10_3 {
	public static void main(String args[]) {
		/*
			(4) 알맞은 코드를 넣어 완성하시오.
		*/
		Outer3 o = new Outer3();
		Outer3.Inner inner = o.new Inner();
		
		inner.method1();
	}
}
