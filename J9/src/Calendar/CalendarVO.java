package Calendar;

public class CalendarVO {
	
	//�⵵
	private int year;
	//��
	private int month;
	//6�� 5��
	private int date;
	//ȭ������ 3 ���ڷ�...
	private int day_of_week;
	//���ڷ� ������ ������ ���� ���Ϸ� ���� 3->ȭ����
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
