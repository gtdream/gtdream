package nine;
//320
class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";

		/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/

		int last = fullPath.lastIndexOf("\\");

		path = fullPath.substring(0, last);

		fileName = fullPath.substring(last+1);
		
		
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}
}
