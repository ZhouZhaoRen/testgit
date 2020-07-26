package com.zzr.test02;

public class HelloWorld {
	private static String c = "哈哈";

	// 内部类Inner。类Inner在类HelloWorld的内部
	public static class Inner {
		private String a = "呵呵";

		public void show() {
			System.out.println("HelloWorld的内部类" + c);
		}
	}

	public static void main(String[] args) {
		// 创建外部类
		HelloWorld hello = new HelloWorld();
		Inner inner = new Inner();
		inner.show();
		// System.out.println(inner);
	}
}
