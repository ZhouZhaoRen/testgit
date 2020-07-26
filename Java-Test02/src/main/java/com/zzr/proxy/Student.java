package com.zzr.proxy;

public class Student implements Person {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub
		System.out.println(name + "上交50块钱班费");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
