package chosung;

public class ChosongSearch {

	public static void main(String[] args) {

		String str = convertName("소다 /카시오패션스포츠시계");

		System.out.println(str);	//ㅅㄷ /ㅋㅅㅇㅍㅅㅅㅍㅊㅅㄱ

	}

	//메인초성검색
	public static String convertName(String str) {

		String chosung = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			//한글값인지 아닌지 확인
			if (c > 44032 && c < 55203) {
				// 초성결과 나온다 소=>ㅅ
				chosung += direct(c);

			} else {
				//스페이스 기호 영어는 그냥 ++
				chosung += c;

			}

		}// end for

		return chosung;
	}

	//초성검색 알고리즘
	private static String direct(char b) {
		String chosung = null;

		int first = (b - 44032) / (21 * 28);
		switch (first) {
		case 0:
			chosung = "ㄱ";
			break;
		case 1:
			chosung = "ㄲ";
			break;
		case 2:
			chosung = "ㄴ";
			break;
		case 3:
			chosung = "ㄷ";
			break;
		case 4:
			chosung = "ㄸ";
			break;
		case 5:
			chosung = "ㄹ";
			break;
		case 6:
			chosung = "ㅁ";
			break;
		case 7:
			chosung = "ㅂ";
			break;
		case 8:
			chosung = "ㅃ";
			break;
		case 9:
			chosung = "ㅅ";
			break;
		case 10:
			chosung = "ㅆ";
			break;
		case 11:
			chosung = "ㅇ";
			break;
		case 12:
			chosung = "ㅈ";
			break;
		case 13:
			chosung = "ㅉ";
			break;
		case 14:
			chosung = "ㅊ";
			break;
		case 15:
			chosung = "ㅋ";
			break;
		case 16:
			chosung = "ㅌ";
			break;
		case 17:
			chosung = "ㅍ";
			break;
		case 18:
			chosung = "ㅎ";
			break;
		default:
			chosung = String.valueOf(b);
		}
		return chosung;

	}
	
	
	
	//스페이스 체크
	private static int speaceCheck(String name) {
		int spaceCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char epName = name.charAt(i);
			if (epName == ' ') {
				// System.out.println("띄어쓰기 공백입니다.");
				spaceCount++;
			}
		}
		return spaceCount;
	}

}
/**
 * 
 * 
1. 초성은 19자로 
ㄱ, ㄲ, ㄴ, ㄷ, ㄸ, ㄹ, ㅁ, ㅂ, ㅃ, ㅅ,
ㅆ, ㅇ, ㅈ, ㅉ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ


2. 중성은 21자로
ㅏ, ㅐ, ㅑ, ㅒ, ㅓ, ㅔ, ㅕ, ㅖ, ㅗ, ㅘ,
ㅙ, ㅚ, ㅛ, ㅜ, ㅝ, ㅞ, ㅟ, ㅠ, ㅡ, ㅢ,
ㅣ


3. 종성은 27자로
ㄱ, ㄲ, ㄳ, ㄴ, ㄵ, ㄶ, ㄷ, ㄹ, ㄺ, 
ㄻ, ㄼ, ㄽ, ㄾ, ㄿ, ㅀ, ㅁ, ㅂ, ㅄ, ㅅ, 
ㅆ, ㅇ, ㅈ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ


< 규칙1>
1.중성이 바뀌는 경우 코드값 차이 : 28
2.초성이 바뀌는 경우 코드값 차이 : 588(21*28)
3. 한글에 대한 첫 코드값('가'의 코드값): 44032

<응용>
가 - 44032
까 - 44620
나 - 45208
다 - 45796
따 - 46384
라 - 46972
마 - 47560
바 - 48148
빠 - 48736
사 - 49324
싸 - 49912
아 - 50500
자 - 51088
짜 - 51676
차 - 52264
카 - 52852
타 - 53440
파 - 54028
하 - 54616

초성: 글자의 코드에서 44032를 빼고, 21*28로 나눈 몫 0 ~ 18
중성: 글자의 코드에서 44032를 빼고, 21*28로 나눈 나머지를 다시 28로 나눈 몫 0 ~ 20
종성: 글자의 코드에서 44032를 빼고, 21*28로 나눈 나머지를 다시 28로 나눈 나머지 0 ~ 27
*/
