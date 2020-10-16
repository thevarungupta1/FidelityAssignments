package Spring_Project;

import java.util.*;

public class Employee {
	
	private String name;
	private List<String> emails;
	private Set<String> address;
	private Map<String, String> departments;
	
	public Employee() {}

	public Employee(String name, List<String> emails, Set<String> address, Map<String, String> departments) {
		super();
		this.name = name;
		this.emails = emails;
		this.address = address;
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getDepartments() {
		return departments;
	}

	public void setDepartments(Map<String, String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emails=" + emails + ", address=" + address + ", departments=" + departments
				+ "]";
	}
	
	
	

}
