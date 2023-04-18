
class Calculator{
	
	int year;
	int month;
	
	public int add() {
		return Math.addExact(month, year);
	}
	
}
public class Sample19 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.year = 1987;
		cal.month = 11;
		System.out.println(cal.add());
		

	}

}
