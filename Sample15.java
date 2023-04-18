
class Pastel13{
	
	private int size;
	private int color;
	
	public Pastel13() {
		
	}
	
	public Pastel13(int size, int color) {
		this.setSize(size);
		this.setColor(color);
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public String toString() {
		return "このパステルのサイズは"+ size +", "+ "色番号は" + color;
	}
	
}
public class Sample15 {

	public static void main(String[] args) {
		
		Pastel13 crepath = new Pastel13();
		crepath.setSize(50);
		crepath.setColor(2);
		System.out.println(crepath.toString());
		
		Pastel13 pastel = new Pastel13(60,3);
		System.out.println(pastel.toString());
		

	}

}
