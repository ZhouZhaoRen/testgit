package com.zzr.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPITest {
	public static void main(String[] args) {
		ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
		Iterator<Search> iterator = serviceLoader.iterator();
		while (iterator.hasNext()) {
			Search searchImpl = iterator.next();
			searchImpl.print();

		}
	}
}
