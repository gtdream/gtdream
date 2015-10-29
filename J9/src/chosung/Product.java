package chosung;

public class Product {
	
	Product(String no, String name, long a, long b){
		this.no=no;
		this.name=name;
		this.a=a;
		this.b=b;
	
	}
	String no;
	String name;
	long a;
	long b;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getA() {
		return a;
	}
	public void setA(long a) {
		this.a = a;
	}
	public long getB() {
		return b;
	}
	public void setB(long b) {
		this.b = b;
	}
	
}
