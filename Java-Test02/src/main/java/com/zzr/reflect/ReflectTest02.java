package com.zzr.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest02 {
	public static void main(String[] args) throws Exception {
		// 获取类的class信息
		Class<?> clazz = Class.forName("com.zzr.reflect.Student");
		// Class<?> clazz = Class.forName("java.lang.Object");
		// 拿到了类信息就可以为所欲为了
		// 通过反射操作类的方法

		Student s = (Student) clazz.newInstance();
		// Method method = clazz.getMethod("printName", String.class);
		// method.invoke(s, "社会你仁哥"); // 通过class对象创建对象，再通过反射获取对象的具体方法，进而操作这个方法

		Method[] methods = clazz.getMethods(); // getMethods()获取了Student中除了私有方法外的所有方法，包括父类的
		clazz.getDeclaredMethods(); // 获取了Student中所有方法，包括私有方法，但不包括父类中的方法
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("-----------------------------");
		Method[] declaredMethods = clazz.getDeclaredMethods(); // 获取了Student中所有方法，包括私有方法，但不包括父类中的方法
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
			if (method.getName().equals("printName")) {
				method.invoke(s, "仁哥");
			}
		}
		System.out.println("----------------");
		// Field[] fields = clazz.getFields(); // 获取所有公有属性
		Field[] declaredFields = clazz.getDeclaredFields(); // 获取私有属性，但是不一定能操作
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}
		System.out.println("--------------");
		Field declaredField = clazz.getDeclaredField("name"); // 获取某个具体的属性
		declaredField.setAccessible(true); // 表示可以访问这个属性
		declaredField.set(s, "renge");
		System.out.println(s + "   " + declaredField.getName());
	}
}
