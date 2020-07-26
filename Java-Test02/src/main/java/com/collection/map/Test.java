package com.collection.map;

public class Test {

	private class a {
		public void say() {
			System.out.println("a");
		}
	}

	private static class b {
		public static void say() {
			System.out.println("say");
		}
	}

	private static void test01() {
		class bbb {

		}

		new tt() {

			@Override
			public void aa() {
				System.out.println("aa");

			}

		}.aa();
	}

	public static void main(String[] args) {
		Test test = new Test();
		a a = test.new a();
		a.say();
		Test.test01();
		b b = new b();
		b.say();
		System.out.println(1 << 7);
		int initialCapacity = 15;
		int c = initialCapacity + (initialCapacity >>> 1) + 1;
		System.out.println(c);
		int tableSizeFor = tableSizeFor(c);
		System.out.println(tableSizeFor);

	}

	public static int tableSizeFor(int c) {
		int n = c - 1;
		System.out.println(n);
		n |= n >>> 1;
		System.out.println(n);
		n |= n >>> 2;
		System.out.println(n);
		n |= n >>> 4;
		System.out.println(n);
		n |= n >>> 8;
		System.out.println(n);
		n |= n >>> 16;
		System.out.println(n);
		return (n < 0) ? 1 : n + 1;
	}
}

interface tt {
	void aa();
}
