package com.java;

public class Test02 {
	public static void main(String[] args) {
		String a = new String("ab"); // a 为一个引用
		String b = new String("ab"); // b为另一个引用,对象的内容一样
		String aa = "ab"; // 放在常量池中
		String bb = "ab"; // 从常量池中查找
		if (aa == bb) // true
			System.out.println("aa==bb");
		if (a != b) // false，非同一对象
			System.out.println("a!=b");
		if (a.equals(b)) // true
			System.out.println("aEQb");
		if (42 == 42.0) { // true
			System.out.println("true");
		}

		System.out.println(1000 == 1000.00 ? true : false);
		int ee = 1000;
		int ff = 1000;
		System.out.println(ee == ff ? true : false);
		Integer e = 128;
		Integer f = 128;
		Integer c = new Integer("130");
		Integer d = new Integer("130");
		System.out.println(c.equals(d) ? true : false);
		System.out.println(e == f ? true : false);
	}
}
