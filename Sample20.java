

public class Sample20 {

	public static void main(String[] args) {
		
		KukuChecker check = new KukuChecker();
		
		int[][] kuku = new int[9][9];
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				kuku[i-1][j-1] = i*j;
			}
		}
		System.out.println(check.validate(kuku));
	}

}
