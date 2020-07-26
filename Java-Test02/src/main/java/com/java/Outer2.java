package com.java;

public class Outer2 {

	public void test(int a, int b) {
		System.out.println(22);
	}

	public void test1(int b, int a) {

	}

	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		outer2.test(2);
	}

	private void test(int i) {
		Service service = new Service() {

			@Override
			public void method() {
				for (int j = 0; j < i; j++) {
					System.out.println("匿名内部类");
					method2();
				}

			}

			@Override
			public void method2() {
				System.out.println("method2");

			}
		};
		service.method();
		service.method2();
	}
}

interface Service {
	void method();

	void method2();
}
