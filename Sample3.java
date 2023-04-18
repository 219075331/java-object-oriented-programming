

class Account2{
	String name;
	int no;
	long balance;
	
	void deposit(long amount) {
		balance += amount;
	}
	
	void withdraw(long amount) {
		balance -= amount;
	}
}
public class Sample3 {

	public static void main(String[] args) {
		
		Account2 acc = new Account2();
		
		acc.name = "銀行太郎";
		acc.no = 100;
		acc.balance = 10000L;
		
		System.out.println("-----最初の状態-----");
		System.out.println("口座名義：" + acc.name + " 貯金残高：" + acc.balance);
		
		System.out.println("-----1000　を預金-----");
		acc.deposit(1000);
		System.out.println("口座名義：" + acc.name + " 貯金残高：" + acc.balance);
		
		System.out.println("-----10000　を引き出し-----");
		acc.withdraw(10000);
		System.out.println("口座名義：" + acc.name + " 貯金残高：" + acc.balance);

	}

}
