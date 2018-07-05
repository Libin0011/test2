package com.how2j.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2j.ioc.PropertyDemo;
//Eclipse��֧��Spring5.0.5
public class Test {
	public static void main(String[] args) {
//		����spring�����ļ����������ö���
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		�õ����ô����Ķ���
		PropertyDemo pDemo = (PropertyDemo)context.getBean("propDemo");
		
		System.out.println(pDemo);
	    System.out.println(Arrays.toString(pDemo.getArrs()));
	    System.out.println(pDemo.getList());
	    System.out.println(pDemo.getMap());
	    System.out.println(pDemo.getProperties());
	    
	}

}
