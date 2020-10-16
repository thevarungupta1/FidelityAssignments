package Day18;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadEmployee {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        // get all employees
        
        
        // get employee by id
        // select * from employee where id = 1
        Employee employee = (Employee)session.get(Employee.class, 12);
        //session.load(theClass, id)
        factory.close();
		
	}

}
