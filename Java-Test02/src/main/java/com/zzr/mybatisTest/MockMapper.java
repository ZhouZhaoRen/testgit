package com.zzr.mybatisTest;

import org.apache.ibatis.annotations.Select;

public interface MockMapper {

	@Select("select * from mock")
	public Object getAll();
}
