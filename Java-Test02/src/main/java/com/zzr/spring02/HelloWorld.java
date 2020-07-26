package com.zzr.spring02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;

public class HelloWorld implements SmartInitializingSingleton, SmartLifecycle, InitializingBean, DisposableBean,
		MyInterface, BeanNameAware, ApplicationContextAware, BeanPostProcessor {

	// private final Log logger = LogFactory.getLog(getClass());
	private boolean isRunning;

	public HelloWorld() {
		System.out.println("实例化");
	}

	public void sayHello() {
		System.out.println("hello World");
	}

	public void afterSingletonsInstantiated() {
		System.out.println("SmartInitializingSingleton afterSingletonsInstantiated");
	}

	public void start() {
		isRunning = true;
		System.out.println("LifeCycle start");
	}

	public void stop() {
		System.out.println("LifeCycle stop");
	}

	public boolean isRunning() {
		return isRunning;
	}

	public boolean isAutoStartup() {
		return true;
	}

	public void stop(Runnable callback) {
		System.out.println("LifeScycle stop");
		callback.run();
	}

	public int getPhase() {
		return 0;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterproperties set");
	}

	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	public void my(String str) {
		System.out.println(str);
	}

	public void setBeanName(String name) {
		System.out.println("set bean Name aware");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("set Application Aware");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("实例化之前操作" + beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("实例化之后操作" + beanName);
		return null;
	}
}
