package Day18;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mcastudent")
public class Employee {
	@Id
	private int id;
	@Column(name = "id")
	private String name;
	private String div;
	
	
	public Employee() {}

	public Employee(int id, String name, String div) {
		super();
		this.id = id;
		this.name = name;
		this.div = div;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdiv() {
		return div;
	}

	public void setdiv(String div) {
		this.div = div;
	}

	
	
	

}
