package com.zzr.test01;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest01 {
	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
		/*
		 * for (int i = 0; i < Integer.MAX_VALUE; i++) { newFixedThreadPool.execute(()
		 * -> { try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block // e.printStackTrace(); } }); }
		 */

		/*
		 * for (int i = 0; i < 5; i++) { newCachedThreadPool.execute(() -> {
		 * System.out.println(Thread.currentThread().getName() + "正在执行"); }); }
		 */

		/*
		 * for (int i = 0; i < 5; i++) { newSingleThreadExecutor.execute(() -> {
		 * System.out.println(Thread.currentThread().getName() + "正在执行"); }); }
		 */

		/**
		 * 创建一个给定初始延迟的间隔性的任务，之后的每次任务执行时间为 初始延迟 + N * delay(间隔)
		 */
		/*
		 * newScheduledThreadPool.scheduleWithFixedDelay(() -> {
		 * System.out.println(Thread.currentThread().getName() + "正在执行");
		 * System.out.println("currentTime：" + System.currentTimeMillis()); }, 1, 3,
		 * TimeUnit.SECONDS); newScheduledThreadPool.shutdown();// 线程变为SHUTDOWN状态
		 * newScheduledThreadPool.shutdownNow();// 线程变为stop状态
		 */

		newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "正在执行");
				System.out.println("currentTime：" + new Date());

			}

		}, 1, 3, TimeUnit.SECONDS);

	}
}
