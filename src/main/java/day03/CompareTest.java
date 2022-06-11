package day03;

/**
	运算符之三：比较运算符		<p>
	==  !=  >  <  >= <=  instanceof	<p>

	结论：<p>
	1.比较运算符的结果是boolean类型	<p>
	2.区分 ==  和  =
*/
class CompareTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		//false
		System.out.println(i == j);
		//20
		System.out.println(i = j);

		boolean b1 = true;
		boolean b2 = false;
		//false
		System.out.println(b2 == b1);
		//true
		System.out.println(b2 = b1);
	}
}
