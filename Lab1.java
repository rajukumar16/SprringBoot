package com.nfdil.com;

import java.util.List;
import org.springframework.context.annotation.*;
/*
* @Author : Raju Kumar
* @company : Virtusa Consuling Pvt. Ltd.
* */
public class Lab1 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx=new
		AnnotationConfigApplicationContext(JLCAppConfig.class);
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("custDAO");
		
		// 1. addCustomer
		Customer cust1 = new Customer(102, "sd", "sd@jlc", 9999, "Blore");
		cdao.addCustomer(cust1);
		
		// 2. getAllCustomers
		System.out.println("getAllCustomers");
		List<Customer> list=cdao.getAllCustomers();
		list.forEach( cust -> System.out.println(cust) );
		}
	
}
