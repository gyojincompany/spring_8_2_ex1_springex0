package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println ("adminID : " + connection.getAdminId());
		System.out.println ("adminPW : " + connection.getAdminPw());
		System.out.println ("sub_adminID : " + connection.getSub_adminId());
		System.out.println ("sub_adminPW : " + connection.getSub_adminPw());
		
		ctx.close();
		
		
	}

}
