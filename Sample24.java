import java.util.Scanner;

public class Sample24 {

	public static void main(String[] args) {
		
		int inputedNum = 1;
		int result = 0;
		
		while( inputedNum != 0) {
			
			System.out.println("整数を１つ入力してください。＞　");
			Scanner scan = new Scanner(System.in);
			inputedNum = scan.nextInt();
			
			System.out.println("受け付けた値：　" + inputedNum);
			
			result += inputedNum;
			System.out.println("総合計：　" + result);
		}
		
		System.out.println("プログラムを修了しました。");
		

	}

}
