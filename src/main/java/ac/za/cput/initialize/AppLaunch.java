/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.initialize;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ac.za.cput.Services.HelloWorld;
import org.springframework.beans.BeansException;

public class AppLaunch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws BeansException {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			HelloWorld yo = (HelloWorld) context.getBean("helloWorldBean");
			
			System.out.println("List: " + yo.getList());
			
			System.out.println("Set : " + yo.getSet());
			
			System.out.println("Map : " + yo.getMap());
			
			System.out.println("Props : " + yo.getProps());
					
	}
}

