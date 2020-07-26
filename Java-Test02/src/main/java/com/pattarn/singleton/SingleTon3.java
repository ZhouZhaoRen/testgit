package com.pattarn.singleton;

/**
 * 饿汉式，线程安全
 */
public class SingleTon3 {
	// 类加载的时候就实例化，之后的获取实例化操作返回的全是同一个instance，故操作线程安全，但是容易产生垃圾对象，浪费内存
	private static SingleTon3 instance = new SingleTon3();

	private SingleTon3() {

	}

	public static SingleTon3 getInstance() {
		return instance;
	}
}
