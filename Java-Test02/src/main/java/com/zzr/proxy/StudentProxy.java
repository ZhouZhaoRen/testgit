package com.zzr.proxy;

public class StudentProxy implements Person {
	private Student stu;

	public StudentProxy(Person stu) {
		if (stu.getClass() == Student.class) {
			this.stu = (Student) stu;
		}
	}

	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub
		System.out.println(stu.getName() + "学习有了很大的进步");
		stu.giveMoney();
		System.out.println(stu.getName() + "学习开始退步了");
	}
}
