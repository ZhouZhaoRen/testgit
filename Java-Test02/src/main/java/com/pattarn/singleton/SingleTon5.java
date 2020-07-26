package com.pattarn.singleton;

public class SingleTon5 {
	private static class SingletonHolder {
		private static final SingleTon5 instance = new SingleTon5();
	}

	private SingleTon5() {

	}

	public static SingleTon5 getInstance() {
		return SingletonHolder.instance;
	}
}
