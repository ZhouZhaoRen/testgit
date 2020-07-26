package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger();
		int addAndGet = atomicInteger.addAndGet(1);
		System.out.println(addAndGet);
		int addAndGet2 = atomicInteger.addAndGet(3);
		System.out.println(addAndGet2);
		int incrementAndGet = atomicInteger.incrementAndGet();
		System.out.println(incrementAndGet);
		int andSet = atomicInteger.getAndSet(10);
		System.out.println(andSet);
		int andIncrement = atomicInteger.getAndIncrement();
		System.out.println(andIncrement);
	}
}
