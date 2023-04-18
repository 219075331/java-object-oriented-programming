public class Sample30 {

	public static void main(String[] args) {
		
		Category category = new Category("SPORTS_BASEBALL", "野球商品");

		Item[] items = new Item[3];
		items[0] = new Item("XB4862", "金属バック", 21000);
		items[1] = null;
		items[2] = new Item("2H-3Z", "硬式ボール", 399);
		
		
		
		for (Item item : items) {
			try {
				category.setItem(item);
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		for (Item item : category.getItems()) {
			try {
				System.out.println(item.getName());
			}
			catch(NullPointerException e) {
				
			}
			
		}
		
	}
		

}
