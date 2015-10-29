package chosung;

import java.util.List;

public class ProductMain {
	public static void main(String[] args) {
		ProductData data = new ProductData();
		
		List<Product> list = data.getProductList();
		
		String search = "[ぁぉ";
		
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
KFC ずせげぁぁ せげ
さぇ/せさしそささそずさぁ
[けぇ] しぁさげぁし
[じじ] げじし そぉぞし
[ぁぉぇじぜ] LAさぇ
ぁぉぞさけ亜 けぁぞさじ
せせ しぉげさ
いしせ BEST ぉいぞ 22じ
ぜさげ じずじじF/Wさささじ
亜しけし けぇせぜぉそ/そぉ
ぜぉぉぉじ そぉけしさいせじ
いしせ いい そず けしじ
ずぁ/いぁ/げぁ ぁけしじ
せじし 亜しささぜぉぇさず
ぇぇぉそせ ぇじぁげ
[ぞせしせ]じししぞ 3し189000
HK CLAぇししぜ
[ずぇ] けぞげ
[ぇぇけ] しいそげ
しじ そぁげさ さぉしさ1kg

 * 
 * 
 */