package day02;

/**
	基本数据类型之间的运算规则：

	前提：这里讨论只是7种基本数据类型变量间的运算。不包含boolean类型的。<p>

	1. 自动类型提升：<p>
		结论：<p>
			 1>两种类型是彼此兼容的		<p>
			 2> 转换的目标类型的范围一定要大于 转换的源类型	<p>
             3>当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。<p>


		byte 、char 、short --> int --> long --> float --> double	<p>
		特别的：当byte、char、short三种类型的变量做运算时，结果为int型 (例外: final修饰的short, char变量相加后不会被自动提升。)	<p>

	2. 强制类型转换：见VariableTest3.java	<p>

	说明：此时的容量大小指的是，表示数的范围的大和小。比如：float容量要大于long的容量
*/
class VariableTest2 {
	public static void main(String[] args) {
		
		byte b1 = 2;
		int bb2 = 3;
		// 报错
		//byte bb3 = b1 + bb2;
		int i1 = 129;
		//编译不通过
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;
		//123.0
		System.out.println(d1);

		double d2 = 2;
		System.out.println("d2: " + d2);

		//***************特别地*********************
		//97
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println("i4: " + i4);

		short s2 = 10;
		//char c2  = c1 + s2;//编译不通过

		byte b2 = 10;
		//char c3 = c1 + b2;//编译不通过

		//short s3 = b2 + s2;//编译不通过

		//short s4 = b1 + b2;//编译不通过
		//****************************************

	}
}
