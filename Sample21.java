
public class Sample21 {

	public static void main(String[] args) {
		
		System.out.println("受け取ったコマンドライン引数 : " + args.length);
		
		for( int i = 0; i < args.length; i++) {
			System.out.println(i + "個目のコマンドライン引数:" + args[i]);
		}

	}

}
