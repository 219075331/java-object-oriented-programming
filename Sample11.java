

class NumberUtil{
	
	public int max(int a, int b) {
		return Math.max(a,b);		
	}
	public int max(int a, int b, int c) {	
		int x = Math.max(a, b);
		if ( x > c ) {
			return x;
		}
		return c;
	}
	public double max(double a, double b) {	
		return Math.max(a,b);
	}
	public double max(double a, double b, double c) {
		double x = Math.max(a, b);
		if ( x > c ) {
			return x;
		}
		return c;
	}
}
public class Sample11 {

	public static void main(String[] args) {
		
		NumberUtil util = new NumberUtil();
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println(a + "と"+ b + "で大きいのは" + util.max(a, b) + "です。");
		System.out.println(a + "と"+ b + "と"+ c + "で大きいのは" + util.max(a, b,c) + "です。");
		
		double x = 20.1;
		double y = 6.8;
		double z = 12.8;
		System.out.println(x + "と"+ y + "で大きいのは" + util.max(x, y) + "です。");
		System.out.println(x + "と"+ y + "と"+ z + "で大きいのは" + util.max(x, y,z) + "です。");
			

	}

}
