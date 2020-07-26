package com.zzr.test03;

public class Test02 {
	public Test02() {
		System.out.println("执行构造 函数");
	}

	public static void main(String[] args) {
		// System.out.println(Child.value);
		int a = 1000;
		Integer b = 1000;
		Integer c = 1000;
		Integer d = new Integer(1000);
		/*
		 * System.out.println(a == b); // true System.out.println(b == c); // false
		 * 1000不在缓冲池内，所以是false System.out.println(a == d); // true System.out.println(c
		 * == d); // false 创建了新的对象，d指向的是堆内存
		 */ String f = "aaa";
		String g = "aaa";
		// System.out.println(f == g);
		String e = new String("aaa");
		String h = new String("aaa");
		System.out.println("e==h?--------" + e == h);
		// System.out.println(e == f); // false
	}
}
