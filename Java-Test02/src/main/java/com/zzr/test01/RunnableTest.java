package com.zzr.test01;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("实现runnable接口启动线程");
	}

	public static void main(String[] args) {
		RunnableTest runnableTest = new RunnableTest();
		Thread thread = new Thread(runnableTest);
		thread.start();
		Integer a = 1;
		int b = 1;
		System.out.println(a == b);
	}

}
