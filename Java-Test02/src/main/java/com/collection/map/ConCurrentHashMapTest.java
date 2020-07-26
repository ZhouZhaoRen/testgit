package com.collection.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapTest {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(4);
		concurrentHashMap.put(1, "第一");
	}
}
