package ten;
class Outer2 {
	static class Inner {
		int iv=200;
	}
}

class Exercise10_2 {
	public static void main(String[] args) {
		/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer2.Inner i = new Outer2.Inner();
		System.out.println(i.iv);
	}
}
