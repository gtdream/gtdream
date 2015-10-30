package Calendar;

public class CalendarVO {
	
	//년도
	private int year;
	//달
	private int month;
	//6일 5일
	private int date;
	//화요일은 3 숫자로...
	private int day_of_week;
	//숫자로 나오는 요일을 실제 요일로 세팅 3->화요일
	private String yoil;

	public int getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(int day_of_week) {
		this.day_of_week = day_of_week;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getYoil() {
		return yoil;
	}
	public void setYoil(String yoil) {
		this.yoil = yoil;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  year+":"+(month+1)+":"+date+":"+yoil;

	}
	
	
}