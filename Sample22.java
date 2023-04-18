
class Decorator{
	static int number;
	
	public static String decorate(String target) {
		
		String s = "";
		String result = "";
		for (int i = 1; i <= number; i++) {
			s +="*";
		}
		result = s + target + s;			
		return result;
	}
	
}
public class Sample22 {

	public static void main(String[] args) {
		
		Decorator.number = 4;
		System.out.println(Decorator.decorate("BANANA"));

	}

}
