package Calendar;

import java.util.ArrayList;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest t = new CalendarTest();
		
//		t.month();
		
		ArrayList<CalendarVO> list = t.month(1982, 10);// 10월 6일은 수요일이구만

		t.monthPrint(list);
	}
	
	Calendar c = Calendar.getInstance();

	// 달의 마지막날 ex 31
	int lastDate;

	// 오늘은 무슨요일인가요? 3=>화
	int day_of_week;

	// 목요일 화요일 수요일 세팅~
	String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

	//특정 년 달 달력
	public ArrayList<CalendarVO> month(int year, int month) {
		
		//달력 리스트
		ArrayList<CalendarVO> list = new ArrayList<CalendarVO>();

		CalendarVO vo;

		// Calendar에서 month는 -1로 저장 됨으로 -1함
		int calendarMonth = month - 1;

		// 달력 날짜 초기 세팅
		c.set(year, calendarMonth, 1);

		// 그달의 마지막날짜를 ex 31일 28일
		lastDate = c.getActualMaximum(Calendar.DATE);

		// 그달의 마지막날까지 for문돌림
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
	}//특정 년 달 달력


	//프린트
	public void monthPrint(ArrayList<CalendarVO> monthList) {

		ArrayList<CalendarVO> list = monthList;

		// 시작날짜 보여주기..
		System.out.println(list.get(0).toString());

		System.out.println("일 월 화 수 목 금 토");

		// 시작날짜 요일 알기위해서
		day_of_week = list.get(0).getDay_of_week();

		// 시작 날 위치 잡기 위해서 이쁘장하게
		for (int i = 0; i < day_of_week - 1; i++) {
			// System.out.printf("%s","   ");
			System.out.print("__!");
		}

		// 달의 마지막날짜 알기 위해서 ex 31
		lastDate = list.get(list.size() - 1).getDate();

		for (int i = 0; i < lastDate; i++) {

			// 10일 미만은 스페이스 하나 뛰어서 이쁘게 ㅎㅎ
			if (list.get(i).getDate() < 10) {
				System.out.print(" ");
			}

			// 요일 1, 2, 3, 4, 찍기
			System.out.print(list.get(i).getDate() + " ");

			// 토요일이면 한칸 뛰기
			if (list.get(i).getYoil().equals("토")) {
				System.out.println();
			}
		}//end for
	}//프린트

	// 이번달 달력
	public void month() {
		// 년도
		int year = c.get(Calendar.YEAR);
		// 달 0월 부터 시작
		int month = c.get(Calendar.MONTH);
		// 날짜 1일 2일 3일
		int date = c.get(Calendar.DATE);
		// 이번달 마지막날짜 2월은 28일 10월은 31일
		int lastDate = c.getActualMaximum(Calendar.DATE);
		// 오늘은 무슨요일인가요? 3=>화
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		// 목요일 화요일 수요일 세팅~
		String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };
		String yoil = DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)];

		// 오늘
		System.out.println(year + ":" + (month + 1) + ":" + date + ":" + yoil);

		System.out.println("일 월 화 수 목 금 토");

		c.set(year, month, 1);

		day_of_week = c.get(Calendar.DAY_OF_WEEK);
		lastDate = c.getActualMaximum(Calendar.DATE);

		// 시작 날 위치 잡기 위해서 이쁘장하게
		for (int i = 0; i < day_of_week - 1; i++) {
			// System.out.printf("%s","   ");
			System.out.print("__!");
		}
		// 3이니깐 화요일이면 1일 2월 3화
		for (int i = 0; i < lastDate; i++) {

			c.set(year, month, i + 1);

			// 10일 미만은 스페이스 하나 뛰어서 이쁘게 ㅎㅎ
			if (c.get(Calendar.DATE) < 10) {
				System.out.print(" ");
			}

			// 요일
			System.out.print(c.get(Calendar.DATE) + " ");

			// 날짜 새로 세팅
			yoil = DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)];

			// 토요일이면 한칸 뛰기
			if (yoil.equals("토")) {
				System.out.println();
			}

		}
	}// 이번달 세팅
}

// //년도
// int year = c.get(Calendar.YEAR);
// //달 0월 부터 시작
// int month = c.get(Calendar.MONTH);
// //날짜 1일 2일 3일
// int date = c.get(Calendar.DATE);
// //이번달 마지막날짜 2월은 28일 10월은 31일
// int lastDate = c.getActualMaximum(Calendar.DATE);
// //오늘은 무슨요일인가요? 3=>화
// int day_of_week = c.get(Calendar.DAY_OF_WEEK);
// //목요일 화요일 수요일 세팅~
// String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
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
