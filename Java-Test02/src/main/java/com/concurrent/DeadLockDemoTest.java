package com.concurrent;

public class DeadLockDemoTest {
	private static Object resource1 = new Object();
	private static Object resource2 = new Object();

	public static void main(String[] args) {
		new Thread(() -> {
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName() + "get resource1");

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("error");
				}

				// 睡醒后，去竞争资源2
				System.out.println(Thread.currentThread().getName() + "waiting get resource2");
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + "get resource2");
				}
			}

		}, "线程1").start();

		// 另一个线程
		new Thread(() -> {
			synchronized (resource2) {
				System.out.println(Thread.currentThread().getName() + "get resource2");
				try {
					Thread.currentThread().interrupt();
					Thread.interrupted();
					if (Thread.currentThread().isInterrupted()) {
						System.out.println(" 程序中断了");
					}
					// resource1.wait();
					// resource2.wait();
					System.out.println(Thread.interrupted());
					System.out.println(Thread.interrupted());
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 睡醒后，去竞争资源2
				System.out.println(Thread.currentThread().getName() + "waiting get resource1");
				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName() + "get resource1");
				}
			}

		}, "线程2").start();

	}
}
