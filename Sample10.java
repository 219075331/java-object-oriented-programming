

class Day2{
	private int year;
	private int month;
	private int day;
	
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
public class Sample10 {

	public static void main(String[] args) {
		
		Day2 aDay = new Day2();
		aDay.setYear(1990);
		aDay.setMonth(12);
		aDay.setDay(17);
		System.out.print(aDay.getYear()	+ "年");
		System.out.print(aDay.getMonth()	+ "月");
		System.out.print(aDay.getDay()	+ "日");
		
	}
}
