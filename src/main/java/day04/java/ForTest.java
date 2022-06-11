package day04.java;

/**
 * For循环结构的使用 <p>
 * 一、循环结构的4个要素	<p>
 * ① 初始化条件	<p>
 * ② 循环条件  --->是boolean类型	<p>
 * ③ 循环体	<p>
 * ④ 迭代条件	<p>
 * 二、for循环的结构
 * <p>
 * for(①;②;④){③}
 * 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
class ForTest {
    public static void main(String[] args) {
        //i:1,2,3,4,5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World!");
        }
        //i:在for循环内有效。出了for循环就失效了。
        // System.out.println(i);

        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'), num++) {
            System.out.print('b');
        }
        //输出结果：abcbcbc

        System.out.println();

        //例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        //记录所有偶数的和
        int sum = 0;
        //记录偶数的个数
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            System.out.println("总和为：" + sum);
        }

        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);

    }
}
