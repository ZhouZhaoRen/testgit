package com.zzr.test04;

public class Test01 {
	public static void main(String[] args) {
		ShallowCloneExample e1 = new ShallowCloneExample();
		ShallowCloneExample e2 = null;
		try {
			e2 = e1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		e1.set(2, 222);
		System.out.println(e2.get(2)); // 222

		//
		System.out.println("-------------------");
		DeepCloneExample e3 = new DeepCloneExample();
		DeepCloneExample e4 = null;
		try {
			e4 = e3.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		e3.set(2, 222);
		System.out.println(e4.get(2)); // 2
	}
}
