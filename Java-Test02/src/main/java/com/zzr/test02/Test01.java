package com.zzr.test02;

public class Test01 {
	public static void main(String[] args) {
		Integer a = 200;
		int b = 200;
		System.out.println(a == b);
		Integer c = 200 + 200;
		Integer d = a + b;
		// System.out.println(c == d);
		Integer e = 200;
		Integer f = 200;
		System.out.println(e == f);
		// float g = 1.1; // 不能直接将1.1赋值给float，这是向下转型，会发生精度损失

	}
}
