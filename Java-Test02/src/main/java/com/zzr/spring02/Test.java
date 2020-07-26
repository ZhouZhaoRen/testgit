package com.zzr.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// HelloWorld hello = (HelloWorld) applicationContext.getBean("hello");
		// hello.sayHello();
		// ((AbstractApplicationContext) applicationContext).close();

		// ProxyFactory proxyFactory = new ProxyFactory(MyInterface.class);
		// Object proxy = proxyFactory.getProxy();

	}
}
