public class Item {
	private String id;
	private String name;
	private int price;

	public Item() {
		this(null, null, -1);
	}

	public Item(String id, String name, int price) {
		setId(id);
		setName(name);
		setPrice(price);
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

	public void setPrice(int price) {
		this.price = price;
		if (price < 0) {
			this.price = 0;
		}
	}

	public int getPrice() {
		return price;
	}

	/**
	 * このメソッドは学習範囲外です
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	/**
	 * このメソッドは学習範囲外です
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

}
