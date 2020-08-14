
public class ClassAttributesMethods {
	
	
	public void studentMethod(String student)
	{
		System.out.println("Method to print student name: "+ student);
	}
	
	public void employeeMethod(String employee)
	{
		System.out.println("Method to print employee name: "+ employee);
	}
	
	public void bankMethod(String bank)
	{
		System.out.println("Method to print bank name: "+ bank);
	}
	public static void main(String[] args) {
		
		ClassAttributesMethods obj=new ClassAttributesMethods();
		
		obj.studentMethod("Neha");
		obj.employeeMethod("NS");
		obj.bankMethod("ICICI");
	}

}
