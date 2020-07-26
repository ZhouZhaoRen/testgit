package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public static void main(String[] args) {
		Map<Object, Object> hashMap = new HashMap<>();
		hashMap.put(null, "ll");
		hashMap.put(null, "hh");
		hashMap.put("ll", null);
		hashMap.put("gg", null);
		System.out.println(hashMap);
	}
}
