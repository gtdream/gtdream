package nine;
class Exercise9_12
{
	/*
		(1) getRand메서드를 작성하시오.
	*/

	public static void main(String[] args) 
	{
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+" ,");
	}
	public static String getRand(int a, int b){
		String str="";
		
		//1 0 -1 -2 -3 
		int random = (int)(Math.random()* (Math.abs(b-a)+1)) +Math.min(a, b);
		System.out.println("abs : "+Math.abs(b-a));
		System.out.println("min : "+Math.min(a, b));
		return String.valueOf(random);
	}
	
}
