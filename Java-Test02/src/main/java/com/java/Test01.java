package com.java;

public class Test01 {
	private final int c = 1;
	private final int d = 1;

	// c=d;
	class Inner {
		public void visit() {
			System.out.println("visit outer static  variable:" + c);
			System.out.println("visit outer   variable:" + c);
		}
	}

	public static void main(String[] args) {

		final int aa = 2;
		final int bb = 2;
		// aa = aa;
		// aa = bb;
		// float a=3.4;这样是不行的，3.4是双精度，将双精度的数字赋值给单精度的变量，会造成精度损失
		float a = 3.4f;

		short s1 = 1;
		// s1 = s1 + 1; // 由于 1 是 int 类型，因此 s1+1 运算结果也是 int型，需要强制转换类型才能赋值给 short 型。
		s1 += 1; // 因为 s1+= 1;相当于 s1 = (short(s1 + 1);其中有隐含的强制类型转换。

	}
}
