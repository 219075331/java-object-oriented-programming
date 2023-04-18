
class Account{
	String name;
	int no;
	long balance;
}
public class Sample1 {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.name = "銀行太郎";
		acc.no = 100;
		acc.balance = 10000L;
		System.out.println("口座名義：" + acc.name + "　口座番号：" + acc.no + " 貯金残高：" + acc.balance);

	}

}
