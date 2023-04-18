

class PaintBrush {
	
	public void Squar(int x1, int y1, double x2, double y2) {
		System.out.println("四角形を座標（"+ x1 + "," + y1 + "," + x2 + "," + y2+")で描画しました。");
		
	}
	public void Line(double x1, double y1, int x2, int y2) {
		System.out.println("直線を座標（"+ x1 + "," + y1 + "," + x2 + "," + y2+")で描画しました。");
		
	}
	public void cicle(int x, int y, int z) {
		System.out.println("円を座標（"+ x + "," + y + ")原点に半径" + z + "で描画しました。");
		
	}
	
}


public class Sample12 {

	public static void main(String[] args) {
		
		PaintBrush paint = new PaintBrush();
		paint.Squar(5, 7, 15.0, 20.0);
		paint.Line(5.0, 7.0, 15, 20);
		paint.cicle(10, 20, 5);	

	}

}
