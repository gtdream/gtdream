package nine;
class Exercise9_6 {
	public static String fillZero(String src, int length) {
		/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			1. src�� null�̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
			2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�.
			3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�.
			4. ���̰� legnth�� char�迭�� ��������.
			5. 4���� ������ char�迭�� '0'���� ä���.
			6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
			7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		*/
		
		char []s=src.toCharArray();
		String s1="";
		int j=0;
		for(int i=0;i<length;i++){
			if(s.length<length && i<s.length){
				//5      10
				s1+="0";
			}else if(s.length<length && i>=s.length){ 
				s1+=s[j++];
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		String src = "1234f5";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}
