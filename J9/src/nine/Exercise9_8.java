package nine;
class Exercise9_8 {
	/*
		(1) round메서드를 작성하시오.
	*/
	public static double round(double a, int b){
		double d1 = a*Math.pow(10, b);
		System.out.println("d1 : "+d1);
		double d2 = Math.round(d1);
		System.out.println("d2 : "+d2);
		double d3 = d2/Math.pow(10, b);
		
		return d3;
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}
