package com.pattarn.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class SingleTon4 {
	private static SingleTon4 instance;

	private SingleTon4() {

	}

	public static SingleTon4 getInstance() {
		if (instance == null) {
			synchronized (SingleTon4.class) {
				if (instance == null) {
					instance = new SingleTon4();
				}
			}
		}

		return instance;
	}
}
