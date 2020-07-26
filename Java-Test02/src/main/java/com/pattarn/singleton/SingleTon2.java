package com.pattarn.singleton;

/**
 * 懒汉式，线程安全
 */
public class SingleTon2 {
	private static SingleTon2 instance;

	private SingleTon2() {

	}

	/**
	 * 99%的情况下不需要同步，但是你100%的情况下把方法锁住了，导致效率变得极其低下
	 */
	public static synchronized SingleTon2 getInstance() {
		if (instance == null) {
			instance = new SingleTon2();
		}

		return instance;
	}
}
