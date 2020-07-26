package com.zzr.mybatisTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.ibatis.annotations.Select;

public class InvocationMock implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Select annotation = method.getAnnotation(Select.class);
		String[] value = annotation.value();
		System.out.println(" sql----" + value[0]);
		return null;
	}

}
