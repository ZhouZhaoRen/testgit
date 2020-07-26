package com.zzr.test05;

public class MyThread extends Thread {
	private long i = 0;

	@Override
	public void run() {
		while (true) {
			i++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadLocal<String> tl = new ThreadLocal<>();

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1);
			thread.suspend();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
