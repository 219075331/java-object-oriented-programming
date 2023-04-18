import java.util.ArrayList;
import java.util.List;

public class Category {
	private String id;
	private String name;
	

	public Category() {
		this(null, null);
	}

	public Category(String id, String name) {
		
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

	

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
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
		return true;
	}

}
