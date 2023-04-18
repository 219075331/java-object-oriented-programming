
class Day{
	
	int year;
	int month;
	int day;
	
	String toFormatString() {
		return year + "年" + month + "月" + day + "日";		
	}
}
public class Sample2 {
	public static void main(String[] args) {
		
		Day birthDay = new Day();
		birthDay.year = 1990;
		birthDay.month = 12;
		birthDay.day = 17;
		System.out.println(birthDay.toFormatString());
		
	}	

}
