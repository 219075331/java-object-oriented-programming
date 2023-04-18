

class Account3{
	String name;
	int no;
	private long balance;
	
	void deposit(long amount) {
		balance += amount;
	}
	
	void withdraw(long amount) {
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
public class Sample9 {

	public static void main(String[] args) {
		
		Account3 acc = new Account3();
		
		acc.name = "銀行太郎";
		acc.no = 100;
		
		System.out.println("-----最初の状態-----");
		System.out.println("口座名義：" + acc.name + "　口座番号：" + acc.no + " 貯金残高：" + acc.getBalance());
		System.out.println("-----直接残高を修正-----");
		acc.setBalance(-1000L);
		System.out.println("口座名義：" + acc.name + "　口座番号：" + acc.no + " 貯金残高：" + acc.getBalance());
		
		
		

	}

}
