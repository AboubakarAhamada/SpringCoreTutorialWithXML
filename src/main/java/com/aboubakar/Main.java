/**
 * 
 */
package com.aboubakar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aboubakar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Dependency Injection principle : This class (Main) should not
		 * depend to Car or Bike classes. Instead of use new Car or new Bike we must
		 * create interface to be implemented by Car and Bike classes. And then we have to
		 * ask Spring to provide us a bean via ApplicationContext Or BeanFactory. ApplicationContext
		 * or BeanFactory will read the XML file to get the bean for us. This magic !
		 * 
		
		Vehicle car = new Car(); // We want to avoid this dependence
		car.drive();
		Vehicle bike = new Bike(); // We want to avoid this dependence. 
		bike.drive();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpringXmlFile.xml");
		
		Vehicle vehicle = (Vehicle)context.getBean("vehicle");
		
		vehicle.drive();
	}

}
