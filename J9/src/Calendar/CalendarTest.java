package Calendar;

import java.util.ArrayList;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest t = new CalendarTest();
		
//		t.month();
		
		ArrayList<CalendarVO> list = t.month(1982, 10);// 10�� 6���� �������̱���

		t.monthPrint(list);
	}
	
	Calendar c = Calendar.getInstance();

	// ���� �������� ex 31
	int lastDate;

	// ������ ���������ΰ���? 3=>ȭ
	int day_of_week;

	// ����� ȭ���� ������ ����~
	String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" };

	//Ư�� �� �� �޷�
	public ArrayList<CalendarVO> month(int year, int month) {
		
		//�޷� ����Ʈ
		ArrayList<CalendarVO> list = new ArrayList<CalendarVO>();

		CalendarVO vo;

		// Calendar���� month�� -1�� ���� ������ -1��
		int calendarMonth = month - 1;

		// �޷� ��¥ �ʱ� ����
		c.set(year, calendarMonth, 1);

		// �״��� ��������¥�� ex 31�� 28��
		lastDate = c.getActualMaximum(Calendar.DATE);

		// �״��� ������������ for������
		for (int i = 0; i < lastDate; i++) {
			
			c.set(year, calendarMonth, i + 1);

			vo = new CalendarVO();

			vo.setYear(c.get(Calendar.YEAR));
			vo.setMonth(c.get(Calendar.MONTH));
			vo.setDate(c.get(Calendar.DATE));
			vo.setDay_of_week(c.get(Calendar.DAY_OF_WEEK));
			vo.setYoil(DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)]);
			
			list.add(i, vo);
		}
//		System.out.println(list);
		return list;
	}//Ư�� �� �� �޷�


	//����Ʈ
	public void monthPrint(ArrayList<CalendarVO> monthList) {

		ArrayList<CalendarVO> list = monthList;

		// ���۳�¥ �����ֱ�..
		System.out.println(list.get(0).toString());

		System.out.println("�� �� ȭ �� �� �� ��");

		// ���۳�¥ ���� �˱����ؼ�
		day_of_week = list.get(0).getDay_of_week();

		// ���� �� ��ġ ��� ���ؼ� �̻����ϰ�
		for (int i = 0; i < day_of_week - 1; i++) {
			// System.out.printf("%s","   ");
			System.out.print("__!");
		}

		// ���� ��������¥ �˱� ���ؼ� ex 31
		lastDate = list.get(list.size() - 1).getDate();

		for (int i = 0; i < lastDate; i++) {

			// 10�� �̸��� �����̽� �ϳ� �پ �̻ڰ� ����
			if (list.get(i).getDate() < 10) {
				System.out.print(" ");
			}

			// ���� 1, 2, 3, 4, ���
			System.out.print(list.get(i).getDate() + " ");

			// ������̸� ��ĭ �ٱ�
			if (list.get(i).getYoil().equals("��")) {
				System.out.println();
			}
		}//end for
	}//����Ʈ

	// �̹��� �޷�
	public void month() {
		// �⵵
		int year = c.get(Calendar.YEAR);
		// �� 0�� ���� ����
		int month = c.get(Calendar.MONTH);
		// ��¥ 1�� 2�� 3��
		int date = c.get(Calendar.DATE);
		// �̹��� ��������¥ 2���� 28�� 10���� 31��
		int lastDate = c.getActualMaximum(Calendar.DATE);
		// ������ ���������ΰ���? 3=>ȭ
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		// ����� ȭ���� ������ ����~
		String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" };
		String yoil = DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)];

		// ����
		System.out.println(year + ":" + (month + 1) + ":" + date + ":" + yoil);

		System.out.println("�� �� ȭ �� �� �� ��");

		c.set(year, month, 1);

		day_of_week = c.get(Calendar.DAY_OF_WEEK);
		lastDate = c.getActualMaximum(Calendar.DATE);

		// ���� �� ��ġ ��� ���ؼ� �̻����ϰ�
		for (int i = 0; i < day_of_week - 1; i++) {
			// System.out.printf("%s","   ");
			System.out.print("__!");
		}
		// 3�̴ϱ� ȭ�����̸� 1�� 2�� 3ȭ
		for (int i = 0; i < lastDate; i++) {

			c.set(year, month, i + 1);

			// 10�� �̸��� �����̽� �ϳ� �پ �̻ڰ� ����
			if (c.get(Calendar.DATE) < 10) {
				System.out.print(" ");
			}

			// ����
			System.out.print(c.get(Calendar.DATE) + " ");

			// ��¥ ���� ����
			yoil = DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)];

			// ������̸� ��ĭ �ٱ�
			if (yoil.equals("��")) {
				System.out.println();
			}

		}
	}// �̹��� ����
}

// //�⵵
// int year = c.get(Calendar.YEAR);
// //�� 0�� ���� ����
// int month = c.get(Calendar.MONTH);
// //��¥ 1�� 2�� 3��
// int date = c.get(Calendar.DATE);
// //�̹��� ��������¥ 2���� 28�� 10���� 31��
// int lastDate = c.getActualMaximum(Calendar.DATE);
// //������ ���������ΰ���? 3=>ȭ
// int day_of_week = c.get(Calendar.DAY_OF_WEEK);
// //����� ȭ���� ������ ����~
// String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
// String yoil = DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)];

//
// "\033[1mThis is a BOLD line\033[0m";
// String setBold = "\033[1mThis keeps it bold.";
// String normalLine = "This is a normal (default) line";
// String setNormal = "\033[0mThis un-bolds it.";
// System.out.println(normalLine);
// System.out.println(boldGrayLine);

// System.out.println(year+":"+month+":"+date+":"+yoil);

// System.out.println(c.get(Calendar.YEAR));
// System.out.println(c.get(Calendar.MONTH)+1);
// System.out.println(c.get(Calendar.DATE));
// System.out.println(DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)]);

// java.util.GregorianCalendar[time=1445910830630,
// areFieldsSet=true,
// areAllFieldsSet=true,
// lenient=true,
// zone=sun.util.calendar.ZoneInfo
// [id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],
// firstDayOfWeek=1,
// minimalDaysInFirstWeek=1,
// ERA=1,
// YEAR=2015,
// MONTH=9,
// WEEK_OF_YEAR=44,
// WEEK_OF_MONTH=5,
// DAY_OF_MONTH=27,
// DAY_OF_YEAR=300,
// DAY_OF_WEEK=3,
// DAY_OF_WEEK_IN_MONTH=4,
// AM_PM=0,
// HOUR=10,
// HOUR_OF_DAY=10,
// MINUTE=53,
// SECOND=50,
// MILLISECOND=630,
// ZONE_OFFSET=32400000,
// DST_OFFSET=0]
