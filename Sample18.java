
class Order{
	private String id;
	private Goods product;
	private long amount;
	private Day4 orderDay;
	
	public Order(String id, Goods product, long amount, Day4 orderDay){
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.orderDay = orderDay;
	}
	
	public String toFormatString() {
		return "注文 ID: "+ id + " 注文商品 : " + product.toFormatString() + "数量:" + amount + " 受注日: " + orderDay.toFormatString();
		
	}
}
public class Sample18 {

	public static void main(String[] args) {
		
		Day4 OnsaleDayGoods1 = new Day4(2011,1,20);
		Day4 OrderDayGoods1 = new Day4(2011,5,7);
		Goods goods1 = new Goods("101","アクションフィギュアNo.100",380L,OnsaleDayGoods1);
		
		Order order1 = new Order("1001",goods1,5L,OrderDayGoods1);
		System.out.println(order1.toFormatString());
		
		Day4 OnsaleDayGoods2 = new Day4(2011,3,14);
		Day4 OrderDayGoods2 = new Day4(2011,5,7);
		Goods goods2 = new Goods("102","周年記念プラモデル",280L,OnsaleDayGoods2);
		
		Order order2 = new Order("1002",goods2,15L,OrderDayGoods2);
		System.out.println(order2.toFormatString());

	}

}
