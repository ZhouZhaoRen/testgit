package com.zzr.newInstance;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
	private int id;
	private String name;

	public Student() {
		System.out.println("无参构造器");
	}

	public Student(Integer id) {
		this.id = id;
		System.out.println("有参构造器");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
