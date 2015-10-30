package chosung;

import java.util.Arrays;

public class ChosongSearch {

	public static void main(String[] args) {
		convertName("소다/카시오패션스포츠시계");
	}

	public static int speaceCheck(String name) {
		int spaceCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char epName = name.charAt(i);
			if (epName == ' ') {
				System.out.println("띄어쓰기 공백입니다.");
				spaceCount++;
			}
		}
		return spaceCount;
	}

	public static String[] convertName(String name) {
		/* String rtName = ""; */
		int spaceCount = speaceCheck(name);
		String[] rtName = new String[spaceCount + 1];
		char epName;



		try {
			for (int j = 0; j < spaceCount; j++) {
				String tempString = "";
				for (int i = 0; i < name.length(); i++) {
					epName = name.charAt(i);
//					System.out.println("epName = " + epName);

					if (epName > 44032 && epName < 55203) {
//						System.out.println(epName + "는 한글이 맞습니다.");
						tempString += direct(epName);
					} else {
//						System.out.println(epName + "는 한글이 아닙니다");
						if (epName == ' ') {
							j++;
							tempString = "";
//							System.out.println("j++ 띄어쓰기 공백입니다.");
						}
					}

//					System.out.println("tempString = " + tempString);
					rtName[j] = tempString;
				}
			}
//			System.out.println("[convertName(SearchName)]rtName["+ Arrays.toString(rtName) + "]");
		} catch (Exception e) {
//			System.out.println("convertName err: UserBean.convetName(str)");
		}
		return rtName;
	}

	public static String direct(char b) {
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
		System.out.println("chosung = " + chosung);
		return chosung;

	}

}
