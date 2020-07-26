package com.zzr.test02;

class Parent {
	static {
		System.out.println("Parent");

	}
	static final int value = 123;

}

public class Child extends Parent {
	static {
		System.out.println("Child");
	}
	static final int c_value = 123;

	public static void main(String[] args) {
		// System.out.println(Child.value); //
		// 先初始化父类，输出Parent，初始化阶段value=0，再初始化自己，输出Child，最后输出123
		// System.out.println(Child.c_value); //
		// 先初始化父类，输出Parent，再初始化自己，输出Child，初始化c_value=0，最后输出123
		Child[] chile = new Child[10];
	}
}
