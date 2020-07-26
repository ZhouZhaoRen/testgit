package com.zzr.test03;

public class Test03 extends Thread {
	public static void main(String[] args) {
		String x = "abc";
		String y = x.toUpperCase();
		String replace = x.replace("a", "D");
		System.out.println(replace); // Dbc
		System.out.println(x); // abc
		System.out.println(y); // ABC
		StringBuilder stringBuilder = new StringBuilder();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(true);
		String string = new String("bbb");
		String aa = "bbb";
		String bb = "bbb";
		System.out.println(aa == bb);
		new Thread() {

			public void run() {
				System.out.println("hello Thread");
			};

		}.start();
	}
}
