/**
 *   com.coupang.WEBAPP003.setin.product.ProductData.java
 *
 * ��ϵ� ��ǰ ������ 
 * @author ���� ������ �ֵμ�     
 * @since 2013. 09. 17.
 * @version 1.0
 * @see
 *
 * <pre>
 * ================== �����̷� ================
 *
 *  ������      ������    ��������
 * ----------  --------  ---------------------------
 * 2013. 09. 17.       �ֵμ�    �����ۼ�
 *
 * </pre>
 */

/**
 * @author �ֵμ�
 * 
 */
package chosung;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

	private List<Product> productList = new ArrayList<Product>();

	public ProductData() {

		productList.add(new Product("24771911", "KFC ġŲ�Ұ�� �޺�", 2600, 27));
		productList.add(new Product("24756487", "�Ҵ�/ī�ÿ��мǽ������ð�", 49800, 2));
		productList.add(new Product("24750911", "[��] �������ұ���", 21600, 4));
		productList.add(new Product("24718904", "[����] ������ �������", 29000, 1));
		productList.add(new Product("24703223", "[���ε�����] LA�Ĵ�", 30000, 29));
		productList.add(new Product("24702630", "���ȫ��� ���ȫ����", 65300, 1));
		productList.add(new Product("24692301", "���� �з¹��", 21000, 2));
		productList.add(new Product("24671273", "����Ű BEST ����ȭ 22��", 45000, 20));
		productList.add(new Product("24670532", "������ ��ü����F/W�Ż���", 34900, 2));
		productList.add(new Product("24669991", "�������� ���ťƮ����/�÷�", 17900, 9));
		productList.add(new Product("24669702", "Ʈ�縱���� �����̾�����Ŀ��", 37500, 1));
		productList.add(new Product("24667948", "����Ű ���� ���� ������", 49000, 1));
		productList.add(new Product("24664912", "�౸/��/�豸 ��������", 14000, 6));
		productList.add(new Product("24661322", "������ �����Ż�Ʈ�������", 19800, 2));
		productList.add(new Product("24660422", "�������ũ ��������", 5400, 1));
		productList.add(new Product("24659696", "[�����ī]�������� 3��189000", 189000,1));
		productList.add(new Product("24659141", "HK CLA���̾�Ʈ", 29700, 1));
		productList.add(new Product("24654726", "[û��] ���Ѻ�", 350000, 15));
		productList.add(new Product("24654255", "[���빮] �ִ��Ǻ�", 15000, 4));
		productList.add(new Product("24651025", "���� ǥ����� �����̽�1kg", 18500, 2));

	}

	public void addProduct(Product product) {

		productList.add(product);

	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
