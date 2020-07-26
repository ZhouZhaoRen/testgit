package com.zzr.test01;

public class JavaTest01 {
	public static void main(String[] args) {
		Integer x = Integer.valueOf(130);
		Integer y = Integer.valueOf(130);
		System.out.println(x == y);
		Integer m = 13;
		Integer n = 13;
		System.out.println(m == n);

		boolean a = false;
		boolean b = false;
		System.out.println(a == b);

		final String e = "he";
		final String f = "llo";
		String g = e + f;
		String h = "he" + "llo";
		String c = "hello";
		System.out.println(c == g);
		System.out.println(c == h);
	}
}
