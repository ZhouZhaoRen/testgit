package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(2);
		System.out.println(list);
		list.add(1, 3);
		System.out.println(list);

	}
}
