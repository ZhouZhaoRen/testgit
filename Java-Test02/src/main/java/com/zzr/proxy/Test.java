package com.zzr.proxy;

import java.util.Objects;

public class Test {
	public static void main(String[] args) {
		String a = "";
		Person stu = new Student("张三");
		Person stuProxy = new StudentProxy(stu);
		stuProxy.giveMoney();
		String requireNonNull = Objects.requireNonNull(a);
	}
}
