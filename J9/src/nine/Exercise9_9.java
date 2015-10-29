package nine;
class Exercise9_9 {
	public static String delChar(String s1, String s2){
		String str = "";
		
		char[] c1=s1.toCharArray();	//123@#!@
		
		for(int i=0;i<c1.length; i++){
			if(s2.indexOf(c1[i])!=-1){
				
			}else{
				str+=c1[i];
			}
			
		}
		
		return str;
	}
	public static void main(String[] args) 	{
		System.out.println("(1!2@3^4~5)"+" -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2    3   4\t5)"+" -> " + delChar("(1 2    3   4\t5)"," \t"));
		
	}
}

