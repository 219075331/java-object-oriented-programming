
class Goods{
	private String id;
	private String name;
	private long price;
	Day4 onSaleDay;
	
	
	public Goods(String id, String name, long price, Day4 onSaleDay) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.onSaleDay = onSaleDay;
	}
	
	public String toFormatString() {
		return "商品　ID:"+id+" 商品名: "+name+"　価格:"+price+" 発売日:"+onSaleDay.toFormatString();
	}
	
}
public class Sample17 {

	public static void main(String[] args) {
		
		Day4 SaleDayItem1 = new Day4(2011,2,1);
		Day4 SaleDayItem2 = new Day4(2011,4,29);
				
		Goods item1 = new Goods("101","キリマンジャロ",980L,SaleDayItem1);	
		Goods item2 = new Goods("103","ブルーマウンテン",1450L,SaleDayItem2);
		
		System.out.println(item1.toFormatString());
		System.out.println(item2.toFormatString());		
		

	}

}
