package com.zzr.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class ReeTranLockTest01 {
	ReentrantLock lock = new ReentrantLock();

	public void test01() {

		lock.lock();
		System.out.println("可重入锁的测试");
		lock.unlock();
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE == (Math.pow(2, 31) - 1));
		// AbstractExecutorService
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			/*
			 * Future future = newFixedThreadPool.submit(() -> {
			 * System.out.println("当前线程名字：" + Thread.currentThread().getName()); Object
			 * object = null; try { System.out.print("result## " + object.toString()); }
			 * catch (Exception e) { System.out.println("程序出问题了"); }
			 * 
			 * });
			 */

			Future<?> submit = newFixedThreadPool.submit(() -> {
				System.out.println("current thread name" + Thread.currentThread().getName());
				Object object = null;

				System.out.print("result## " + object.toString());

			});

			try {
				submit.get();
			} catch (Exception e) {
				System.out.println("出异常了");
			}

		}
	}

}
