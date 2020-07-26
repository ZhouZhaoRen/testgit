package com.zzr.test01;

public class ThreadTest01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("调用run方法");
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadTest01 threadTest01 = new ThreadTest01();
		System.out.println("启动前：" + threadTest01.isAlive());
		threadTest01.start();
		System.out.println("启动后：" + threadTest01.isAlive());

	}
}
