package chosung;

public class Product {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	Product(String productNo, String productName, long a, long b){
		this.productName=productName;
	}
	String productNo;
	String productName;
	long a;
	long b;
	
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
