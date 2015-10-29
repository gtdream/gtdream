package chosung;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		while (true) {
			// Scanner s = new Scanner(System.in);
			// System.out.print("초성을 쓰시오 :");
			// String scanstr = s.nextLine();

			ProductData data = new ProductData();

			ArrayList<Product> list = (ArrayList<Product>) data.getProductList();
			String scanstr = "/ㅋ";
			String str = Chosung.chosungNFKC(scanstr);

			for (int i = 0; i < list.size(); i++) {
				String name = list.get(i).getProductName();

				String cho = Chosung.chosungNFD(name);

				if (cho.contains(str)) {
					System.out.println("초성(" + str + ")--------------->" + name);
				}
			} // for end
			
			break;
			
		} // while end
	}// main end

}
