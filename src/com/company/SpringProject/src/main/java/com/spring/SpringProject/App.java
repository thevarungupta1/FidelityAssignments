package com.spring.SpringProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student studentone = (Student) context.getBean("student1");
        Student studenttwo = (Student) context.getBean("student2");
        System.out.println(studentone.toString());
        System.out.println(studenttwo.toString());
        
        
    }
}
