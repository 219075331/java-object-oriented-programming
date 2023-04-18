import java.util.ArrayList;
import java.util.List;


public class Category {
	private String id;
	private String name;
	private List<Item> items;

	public Category() {
		this(null, null);
	}

	public Category(String id, String name) {
		items = new ArrayList<Item>();
		setId(id);
		setName(name);
	}

	public void setId(String id) {
		this.id = id;
		if (id == null) {
			this.id = "NO_ID";
		}
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
		if (name == null) {
			this.name = "NO_NAME";
		}
	}

	public String getName() {
		return name;
	}

	

	public void setItem(Item item) throws NullPointerException{
		if( item == null ) {
			throw new NullPointerException();
		}
		items.add(item);
	}

	

	public List<Item> getItems() {
		return items;
	}

}
