package com.zzr.mybatisTest;

import java.lang.reflect.Proxy;

public class SessionMock {
	public static Object getMapper(Class clazz) {
// loader: 用哪个类加载器去加载代理对象
		// interfaces:动态代理类需要实现的接口
		// h:动态代理方法在执行时，会调用h里面的invoke方法去执行
		Object newProxyInstance = Proxy.newProxyInstance(SessionMock.class.getClassLoader(), new Class[] { clazz },
				new InvocationMock());

		return newProxyInstance;
	}
}
