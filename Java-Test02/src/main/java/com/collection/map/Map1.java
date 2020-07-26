package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(9);
		map.put(1, "diyi");
		map.put(2, "dier");
		map.put(3, "disan");
		//
		Set<Integer> keySet = map.keySet(); // 第一种方法获取key和value
		Iterator<Integer> iterator = keySet.iterator();
		for (Integer integer : keySet) {
			System.out.println(map.get(integer));
		}
		//
		Collection<String> values = map.values(); // 第二种方法获取value，但是获取不到key
		System.out.println(values);

		Set<Entry<Integer, String>> entrySet = map.entrySet(); // 第三种方法获取key和value
		Iterator<Entry<Integer, String>> iterator2 = entrySet.iterator();

		while (iterator2.hasNext()) {
			Entry<Integer, String> next = iterator2.next();
			System.out.println("key=" + next.getKey() + "--->" + "value=" + next.getValue());
		}

	}
}
