package day08.exer;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 4. 对象数组题目：
 * <blockquote>
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * <pre>
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * </pre>
 * </blockquote>
 * <pre>
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * </pre>
 *
 * @author capensis
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明Student类型的数组
        //String[] arr = new String[10];
        Student[] stus = new Student[20];

        //给数组元素赋值
        //给Student对象的属性赋值
        //年级：[1,6]
        //成绩：[0,100]
        IntStream.range(0, stus.length).forEach(i -> {
            stus[i] = new Student();
            stus[i].number = (i + 1);
            stus[i].state = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
            stus[i].score = (int) (Math.random() * (100 + 1));
        });
        //遍历学生数组
        Arrays.stream(stus).map(Student::info).forEach(System.out::println);

        System.out.println("**********   打印三年级的学生信息    **********");
        //问题一：打印出3年级(state值为3）的学生信息。
        IntStream.range(0, stus.length).filter(i -> stus[i].state == 3).mapToObj(i -> stus[i].info()).forEach(System.out::println);

        System.out.println("************************   冒牌排序   ***************************");
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        //如果需要换序，交换的是数组的元素：Student对象！！！
        IntStream
                .range(0, stus.length - 1)
                .forEach(i ->
                        IntStream
                                .range(0, stus.length - 1 - i)
                                // 注意: filter()过滤后,满足条件的元素立即被forEach()执行, 而不是累计之后再被forEach()处理
                                .filter(
                                        j -> {
                                            System.out.println("====================");
                                            return stus[j].score > stus[j + 1].score;
                                        }
                                )
                                .forEach(
                                        j -> {
                                            System.out.println("+++++++++++++++++++++");
                                            Student temp = stus[j];
                                            stus[j] = stus[j + 1];
                                            stus[j + 1] = temp;
                                        }
                                )
                );
        //遍历学生数组
        Arrays.stream(stus).map(Student::info).forEach(System.out::println);

    }
}

class Student {
    /**
     * 学号
     */
    int number;
    /**
     * 年级
     */
    int state;
    /**
     * 成绩
     */
    int score;

    /**
     * 显示学生信息的方法
     */
    public String info() {
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }
}
