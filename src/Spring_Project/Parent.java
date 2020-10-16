package Spring_Project;

public class Parent {
	
	private String name;
	private Child childName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Child getChildName() {
		return childName;
	}
	public void setChildName(Child childName) {
		this.childName = childName;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", childName=" + childName + "]";
	}
	
	

}
