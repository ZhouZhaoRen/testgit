package com.pattarn.singleton;

/**
 * 懒汉式，线程不安全
 */
public class SingleTon1 {
	// 懒加载
	private static SingleTon1 singleTonl;

	// 私有化的构造方法， 这样别的类就不能直接new实例化，只能通过getInstance方法获取实例
	private SingleTon1() {

	}

	// 获取实例的方法，如果实例还没创建，那么创建实例并返回实例
	public static SingleTon1 getInstance() {
		if (singleTonl == null) {
			singleTonl = new SingleTon1();
		}
		return singleTonl;
	}
}
