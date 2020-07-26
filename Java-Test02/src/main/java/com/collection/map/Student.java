package com.collection.map;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("回调比较方法,o=" + o.toString());
		System.out.println("回调比较方法,this=" + this.toString());
		if (this.id - o.id < 0) {
			System.out.println("大于0");
			return this.id - o.id;
		} else {
			return this.id - o.id;
		}

	}

}
