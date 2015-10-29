package chosung;

public class ChosongSearch {

	public static void main(String[] args) {

		String str = convertName("�Ҵ� /ī�ÿ��мǽ������ð�");

		System.out.println(str);	//���� /��������������������

	}

	//�����ʼ��˻�
	public static String convertName(String str) {

		String chosung = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			//�ѱ۰����� �ƴ��� Ȯ��
			if (c > 44032 && c < 55203) {
				// �ʼ���� ���´� ��=>��
				chosung += direct(c);

			} else {
				//�����̽� ��ȣ ����� �׳� ++
				chosung += c;

			}

		}// end for

		return chosung;
	}

	//�ʼ��˻� �˰���
	private static String direct(char b) {
		String chosung = null;

		int first = (b - 44032) / (21 * 28);
		switch (first) {
		case 0:
			chosung = "��";
			break;
		case 1:
			chosung = "��";
			break;
		case 2:
			chosung = "��";
			break;
		case 3:
			chosung = "��";
			break;
		case 4:
			chosung = "��";
			break;
		case 5:
			chosung = "��";
			break;
		case 6:
			chosung = "��";
			break;
		case 7:
			chosung = "��";
			break;
		case 8:
			chosung = "��";
			break;
		case 9:
			chosung = "��";
			break;
		case 10:
			chosung = "��";
			break;
		case 11:
			chosung = "��";
			break;
		case 12:
			chosung = "��";
			break;
		case 13:
			chosung = "��";
			break;
		case 14:
			chosung = "��";
			break;
		case 15:
			chosung = "��";
			break;
		case 16:
			chosung = "��";
			break;
		case 17:
			chosung = "��";
			break;
		case 18:
			chosung = "��";
			break;
		default:
			chosung = String.valueOf(b);
		}
		return chosung;

	}
	
	
	
	//�����̽� üũ
	private static int speaceCheck(String name) {
		int spaceCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char epName = name.charAt(i);
			if (epName == ' ') {
				// System.out.println("���� �����Դϴ�.");
				spaceCount++;
			}
		}
		return spaceCount;
	}

}
/**
 * 
 * 
1. �ʼ��� 19�ڷ� 
��, ��, ��, ��, ��, ��, ��, ��, ��, ��,
��, ��, ��, ��, ��, ��, ��, ��, ��


2. �߼��� 21�ڷ�
��, ��, ��, ��, ��, ��, ��, ��, ��, ��,
��, ��, ��, ��, ��, ��, ��, ��, ��, ��,
��


3. ������ 27�ڷ�
��, ��, ��, ��, ��, ��, ��, ��, ��, 
��, ��, ��, ��, ��, ��, ��, ��, ��, ��, 
��, ��, ��, ��, ��, ��, ��, ��


< ��Ģ1>
1.�߼��� �ٲ�� ��� �ڵ尪 ���� : 28
2.�ʼ��� �ٲ�� ��� �ڵ尪 ���� : 588(21*28)
3. �ѱۿ� ���� ù �ڵ尪('��'�� �ڵ尪): 44032

<����>
�� - 44032
�� - 44620
�� - 45208
�� - 45796
�� - 46384
�� - 46972
�� - 47560
�� - 48148
�� - 48736
�� - 49324
�� - 49912
�� - 50500
�� - 51088
¥ - 51676
�� - 52264
ī - 52852
Ÿ - 53440
�� - 54028
�� - 54616

�ʼ�: ������ �ڵ忡�� 44032�� ����, 21*28�� ���� �� 0 ~ 18
�߼�: ������ �ڵ忡�� 44032�� ����, 21*28�� ���� �������� �ٽ� 28�� ���� �� 0 ~ 20
����: ������ �ڵ忡�� 44032�� ����, 21*28�� ���� �������� �ٽ� 28�� ���� ������ 0 ~ 27
*/
