package nine;
class Exercise9_7 {
	public static boolean contains(String s, String s1){
		return s.indexOf(s1)!=-1;
	}

	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
}
