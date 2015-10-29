package nine;
public class J9_1 {
	public static void main(String[] args) {
		String s = "aabbaaccdddffaa";
		         // 012345678901234

		J9_1 j9 = new J9_1();
		int a = j9.count(s, 0);
		System.out.println(a);

		// int a =s.indexOf("aa");
		// System.out.println(a); //0
		// int b= s.indexOf("aa", a+1);
		// System.out.println(b); //4
		// int c= s.indexOf("aa", b+1);
		// System.out.println(c); //13

	}

	int index1 = 0;
	int count = 0;

	public int count(String s, int index) {

		if (index1 == -1 || s.length() < "aa".length()+index) {
							//15<
			return count;
		} else {
			index1 = s.indexOf("aa", index);
			System.out.println(index + ":" + index1);
			count++;
			count(s, index1 + 1);

			return count;

		}
	}
}
