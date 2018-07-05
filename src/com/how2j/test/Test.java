package com.how2j.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2j.ioc.PropertyDemo;
//Eclipse不支持Spring5.0.5
public class Test {
	public static void main(String[] args) {
//		加载spring配置文件，创建配置对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		得到配置创建的对象
		PropertyDemo pDemo = (PropertyDemo)context.getBean("propDemo");
		
		System.out.println(pDemo);
	    System.out.println(Arrays.toString(pDemo.getArrs()));
	    System.out.println(pDemo.getList());
	    System.out.println(pDemo.getMap());
	    System.out.println(pDemo.getProperties());
	    
	}

}
