package nine;
class Exercise9_10
{
	static String format(String str, int length, int alignment) { 
		return "";
	}

	public static void main(String[] args) {
		String str = "������";

		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}
}
