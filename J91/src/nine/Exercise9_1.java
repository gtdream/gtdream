package nine;
//317
class Exercise9_1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);

		System.out.println("c1="+c1); 	//3k
		System.out.println("c2="+c2); 	//3k
		System.out.println("c1.equals(c2):"+c1.equals(c2));	//true 
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		/*
		   (1) �Ű������� �Ѱ��� ��ü�� num, isKwang�� ������� num, isKwang�� ���ϵ��� �������̵� �Ͻÿ�.
		*/
		
		SutdaCard s = (SutdaCard)obj;
		
		return num==s.num && isKwang==s.isKwang;
	}

	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
