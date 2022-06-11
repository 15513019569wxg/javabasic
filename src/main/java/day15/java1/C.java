package day15.java1;

/**
 *
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
interface A {
	int x = 0;
}

class B {
	int x = 1;
}

@SuppressWarnings("AlibabaRemoveCommentedCode")
class C extends B implements A {
	public void pX() {
		//编译不通过。因为x是不明确的
//		 System.out.println(x);
		// 1
		System.out.println(super.x);
		//0
		System.out.println(A.x);
		
	}

	public static void main(String[] args) {
		new C().pX();
	}
}
