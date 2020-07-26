package com.zzr.mybatisTest;

public class Test {
	public static void main(String[] args) {
		MockMapper mapper = (MockMapper) SessionMock.getMapper(MockMapper.class);
		mapper.getAll();
	}
}
