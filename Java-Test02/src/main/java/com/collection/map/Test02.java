package com.collection.map;

public class Test02 {
	public static void main(String[] args) {
		for (int i = 1; i < 20000; i++) {
			int a = i;
			System.out.println(a >> 2);
			System.out.println(a >>> 2);
		}

	}
}
