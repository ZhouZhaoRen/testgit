package com.java;

public class Test04 {
	public static void main(String[] args) {
		Student student1 = new Student(18, "张三");
		Student student2 = new Student(18, "李四");
		System.out.println("交换前s1：" + student1.toString());
		// System.out.println("交换前s2：" + student2.toString());
		swap(student1);
		// swap(student1, student2);
		System.out.println("交换后s1：" + student1.toString());
		// System.out.println("交换后s2：" + student2.toString());
	}

	private static void swap(Student x, Student y) {
		// TODO Auto-generated method stub
		Student temp = x;
		x = y;
		y = temp;
		System.out.println("：" + x.toString());
		System.out.println("：" + y.toString());

	}

	private static void swap(Student student) {
		// TODO Auto-generated method stub
		student.setAge(20);
		student.setName("李四");
		System.out.println("：" + student.toString());
	}
}
