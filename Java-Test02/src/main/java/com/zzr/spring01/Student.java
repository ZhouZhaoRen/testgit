package com.zzr.spring01;

public class Student {
	private String name;
	private int age;

	// @Value("${name}")
	private String className = "高三12班";

	public Student() {
		System.out.println("构造器实例化 ");
	}

	public void init() {
		this.name = "heheh";
		this.age = 18;
		System.out.println("实例化开始");
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", className='" + className + '\'' + '}';
	}

}
