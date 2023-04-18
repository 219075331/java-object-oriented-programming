
class Day4{
	private int year;
	private int month;
	private int day;
	private int dayOfWeek;
	
	private String[] DayNames = {"日","月","火","水","木","金","土"};
		
	public Day4(int year, int month, int day) {	
		
		this.year = year;
		this.month = month;
		this.day = day;
				
		int tempM = month;
		int tempY = year;
		
		if ( month == 1 || month == 2 ) {
			tempM += 12;
			tempY --;
		}
		dayOfWeek = (tempY + tempY/4 - tempY/100 + tempY/400 + (13 * tempM + 8) / 5 + day) % 7;
	}

	
	public String toFormatString() {
		return year+"年"+month+"月"+ day+"日"+"（"+DayNames[dayOfWeek]+"）";
	}
	

}
public class Sample16 {

	public static void main(String[] args) {
		
		Day4 day1 = new Day4(2011,2,1);
		Day4 day2 = new Day4(2011,4,1);
		System.out.println(day1.toFormatString());
		System.out.println(day2.toFormatString());
		
		
		
		

	}

}
