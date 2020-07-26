package com.atomic;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		int a = 200;
		int b = 200;
		System.out.println(a == b);
		int[] dp = new int[1];
		Arrays.fill(dp, 1);
		System.out.println(dp);
	}
}
