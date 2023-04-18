
public class Sample29 {

	public static void main(String[] args) {
		
		Category cate = new Category("SPORT_BASEBALL","野球商品");
		
		Item item1 = new Item("XB4862","金属バック",21000);
		Item item2 = new Item("R789T","硬式グローブ",21000);
		Item item3 = new Item("2H-3Z","硬式ボール",21000);
		
		cate.setItem(item1);
		cate.setItem(item2);
		cate.setItem(item3);
		
		for ( Item item : cate.getItems()) {
			System.out.println(item.getName());
		}		

	}

}
