package com.zzr.test03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zzr.APP;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { APP.class })
public class Test01 {

	@Test
	public void test01() {
		System.out.println(Child.value);
		// System.out.println(Child.c_value);
	}
}
