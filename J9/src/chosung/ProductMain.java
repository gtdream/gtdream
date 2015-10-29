package chosung;

import java.util.List;

public class ProductMain {
	public static void main(String[] args) {
		ProductData data = new ProductData();
		
		List<Product> list = data.getProductList();
		
		String search = "[����";
		
		for(int i=0; i<list.size(); i++){
			String str = ChosongSearch.convertName(list.get(i).getName());
//			System.out.println(str);
			if(str.contains(search)){
				System.out.println("search:"+search+"\n"+list.get(i).getName());
			}
			
		}
	}
	
}
/*
 * 
KFC ���������� ����
����/��������������������
[����] ������������
[����] ������ ��������
[����������] LA����
������������ ����������
���� ��������
������ BEST ������ 22��
������ ��������F/W��������
�������� ������������/����
���������� ����������������
������ ���� ���� ������
����/����/���� ��������
������ ������������������
���������� ��������
[��������]�������� 3��189000
HK CLA��������
[����] ������
[������] ��������
���� �������� ��������1kg

 * 
 * 
 */