package com.zzr.reflect;

public class ReflectTest01 {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		// 1、通过类名.class获取自己的class信息
		Class<? extends Student> clazz1 = Student.class;
		// 2、通过对象名.getClass()获取自己的class信息
		Class<? extends Student> clazz2 = student.getClass();
		// 3、通过Class.forName()获取自己的class信息
		Class<?> clazz3 = Class.forName("com.zzr.reflect.Student");

		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);

		ClassLoader classLoader = clazz2.getClassLoader();
		System.out.println("类加载器：" + classLoader);
		System.out.println("类加载器：" + classLoader.getParent());
		System.out.println("类加载器：" + classLoader.getParent().getParent());// BoostrapClassLoader是由C写的，所以不能输出
	}
}
