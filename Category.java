import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private String id;
	private String name;
	private List<Item> items;
	
	
	public Category() {
		this(null,null);
	}
	public Category(String id, String name) {
		this.setId(id);
		this.setName(name);
		items = new ArrayList<Item>();
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
	public List<Item> getItems() {
		return items;
	}
	public void setItem(Item item) {
		items.add(item);
		
	}
	
	
	

}
