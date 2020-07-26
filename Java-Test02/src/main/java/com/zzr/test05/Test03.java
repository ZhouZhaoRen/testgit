package com.zzr.test05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test03 {

	private List<Integer> list = new ArrayList<>();
	private Lock lock = new ReentrantLock();
	// 定义读写锁
	private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		final Test03 test = new Test03();

		new Thread("A") {
			public void run() {
				// test.insert2(Thread.currentThread());
				// test.getSynchronized(Thread.currentThread());
				test.getLock(Thread.currentThread());
			};
		}.start();

		new Thread("B") {
			public void run() {
				// test.insert2(Thread.currentThread());
				// test.getSynchronized(Thread.currentThread());
				test.getLock(Thread.currentThread());
			};
		}.start();
	}

	public void insert(Thread thread) {
		// Lock lock = new ReentrantLock();
		lock.lock();
		try {
			System.out.println("线程" + thread.getName() + "得到了锁...");
			for (int i = 0; i < 5; i++) {
				list.add(i);
			}
		} catch (Exception e) {

		} finally {
			System.out.println("线程" + thread.getName() + "释放了锁...");
			lock.unlock();
		}
	}

	/**
	 * 第二个insert方法
	 */
	public void insert2(Thread thread) {
		if (lock.tryLock()) { // 使用 tryLock()
			try {
				System.out.println("线程" + thread.getName() + "得到了锁...");
				for (int i = 0; i < 500000; i++) {
					list.add(i);
				}
			} catch (Exception e) {

			} finally {
				System.out.println("线程" + thread.getName() + "释放了锁...");
				lock.unlock();
			}
		} else {
			System.out.println("线程" + thread.getName() + "获取锁失败...");
		}
	}

	/**
	 * synchronized读锁的演示
	 */
	public synchronized void getSynchronized(Thread thread) {
		long start = System.currentTimeMillis();
		System.out.println("线程" + thread.getName() + "开始读取操作");
		while (System.currentTimeMillis() - start <= 5) { // 读取时间为1秒
			System.out.println("线程" + thread.getName() + "正在进行读取操作");
		}
		System.out.println("线程" + thread.getName() + "读取操作完毕");
	}

	/**
	 * synchronized读锁的演示
	 */
	public void getLock(Thread thread) {
		readWriteLock.readLock().lock();

		try {
			long start = System.currentTimeMillis();
			System.out.println("线程" + thread.getName() + "开始读取操作");
			while (System.currentTimeMillis() - start <= 1) { // 读取时间为1秒
				System.out.println("线程" + thread.getName() + "正在进行读取操作");
			}
			System.out.println("线程" + thread.getName() + "读取操作完毕");
		} finally {
			// TODO: handle finally clause
			readWriteLock.readLock().unlock();
		}
	}
}
