package com.zzr.test01;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest01 {

	public static void main(String[] args) {
		/*
		 * ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(0);
		 * ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		 * ExecutorService newSingleThreadExecutor =
		 * Executors.newSingleThreadExecutor(); ScheduledExecutorService
		 * newScheduledThreadPool = Executors.newScheduledThreadPool(2);
		 */

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 3, TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(100));
		threadPoolExecutor.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					threadPoolExecutor.execute(() -> {
						System.out.println("当前线程：" + Thread.currentThread().getName());
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
				}
			}

		});
	}
}
