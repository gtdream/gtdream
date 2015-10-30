package nine;
class Exercise9_10
{
	static String format(String str, int length, int alignment) { 
		return "";
	}

	public static void main(String[] args) {
		String str = "가나다";

		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
}
