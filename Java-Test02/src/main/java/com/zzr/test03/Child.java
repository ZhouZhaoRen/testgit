package com.zzr.test03;

public class Child extends Parent {
	static {
		System.out.println("Child");
	}
	static int c_value = 123;

	public static void main(String[] args) {
		// System.out.println(Child.value);
		// System.out.println(Child.c_value);
		Child[] c = new Child[10];
	}
}
