
public class Category1 {
	
	private String id;
	private String name;
	
	public Category1(){
		id = "NO_ID";
		name = "NO_NAME";		
	}
	public Category1(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if ( id == null ) {
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

}
