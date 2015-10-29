package chosung;

import java.util.List;

public class ProductMain {
	public static void main(String[] args) {
		ProductData data = new ProductData();
		
		List<Product> list = data.getProductList();
		
		String search = "[丑予";
		
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
KFC 內六仆丑丑 六仆
今之/六今仄公今今公內今丑
[仃之] 仄丑今仆丑仄
[元元] 仆元仄 公予冗仄
[丑予之元兮] LA今之
丑予冗今仃陛 仃丑冗今元
六六 仄予仆今
中仄六 BEST 予中冗 22元
兮今仆 元內元元F/W今今今元
陛仄仃仄 仃之六兮予公/公予
兮予予予元 公予仃仄今中六元
中仄六 中中 公內 仃仄元
內丑/中丑/仆丑 丑仃仄元
六元仄 陛仄今今兮予之今內
之之予公六 之元丑仆
[冗六仄六]元仄仄冗 3仄189000
HK CLA之仄仄兮
[內之] 仃冗仆
[之之仃] 仄中公仆
仄元 公丑仆今 今予仄今1kg

 * 
 * 
 */