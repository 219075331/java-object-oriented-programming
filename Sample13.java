
class Day3{
	
	private int year;
	private int month;
	private int day;
	
	public Day3(int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;		
	}
	
	public String toFormatString() {
		return year+"月"+month+"月"+day+"日";
		
	}
}


public class Sample13 {

	public static void main(String[] args) {
		Day3 Day = new Day3(1991,12,17);
		System.out.println(Day.toFormatString());

	}

}
