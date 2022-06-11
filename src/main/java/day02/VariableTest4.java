package day02;

class VariableTest4 {
	public static void main(String[] args) {
		
		//1.编码情况1：
		long l = 123213;
		System.out.println(l);
		//编译失败：过大的整数
		//long l1 = 21_332_423_235_234_123;
		long l1 = 21332423235234123L;
		System.out.println(l1);

		//****************
		//编译失败, 高精度转换为低精度必须强转
		//float f1 = 12.3;
		float f2 = 12.3f;
		float f3 = (float)12.3;
		//2.编码情况2：
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		byte b = 12;
		/*
		编译失败
		byte b1 = b + 1;
		//编译失败
		float f1 = b + 12.3;
		*/

	}
}
