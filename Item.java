
public class Item {
	
	private String id;
	private String name;
	int price;
	
	public Item() {
		id = "NO_ID";
		name = "NO_NAME";
	}
	public Item(String id, String name, int pirce) {
		this.setId(id);
		this.setName(name);
		this.setPrice(pirce);
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if( id == null ) {
			id = "NO_ID";
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if( name == null ) {
			name = "NO_NAME";
		}
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if ( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	
	

}
