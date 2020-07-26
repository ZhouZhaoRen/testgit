package com.zzr.test05;

import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		Test2 test = new Test2();
		MyThread thread = test.new MyThread();
		thread.start();
		System.out.println("1");
		try {
			Thread.currentThread().sleep(5000);
			System.out.println(2);
		} catch (InterruptedException e) {

		}
		// thread.interrupt();
		Thread.currentThread().suspend();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			try {
				System.out.println("进入睡眠状态");
				Thread.currentThread().sleep(10000);
				System.out.println("睡眠完毕");
			} catch (InterruptedException e) {
				System.out.println("得到中断异常");
			}
			System.out.println("run方法执行完毕");
		}
	}
}
