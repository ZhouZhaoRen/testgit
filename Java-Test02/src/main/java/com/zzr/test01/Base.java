package com.zzr.test01;

import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Base {
	public static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		JavaType javaType = getCollectionType(ArrayList.class, String.class);
		List<State> lst = mapper.readValue("[\"hello\",\"world\"]", javaType);
		System.out.println(lst);
		Lock reentrantLock = new ReentrantLock();
		reentrantLock.lock();
		reentrantLock.unlock();

	}

	// 获取泛型的Collection Type
	public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
	}
}
