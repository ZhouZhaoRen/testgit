package com.collection.map;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		Student student1 = new Student(1, "第一");
		Student student2 = new Student(2, "第二");
		Student student3 = new Student(3, "第三");
		Student student4 = new Student(4, "第si");
		treeSet.add(student3);
		treeSet.add(student1);
		treeSet.add(student4);
		treeSet.add(student2);

		System.out.println(treeSet);

	}
}
