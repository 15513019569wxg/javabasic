package day01;

/**
 * @author wxg
 * @date 2022/4/7-21:46
 * @quotes 小不忍则乱大谋
 */
public class Hello {
    /**
        对第一个java程序进行总结  <p>
        1.
        java程序编写-编译-运行的过程   <p>
        编写：我们将编写的java代码保存在以".java"结尾的源文件中   <p>
        编译：使用javac.exe命令编译我们的java源文件。格式：javac 源文件名.java <p>
        运行：使用java.exe命令解释运行我们的字节码文件。 格式：java 类名     <p>

        2.
        在一个java源文件中可以声明多个class。但是，只能最多有一个类声明为public的。而且要求声明为public的类的类名必须与源文件名相同。    <p>

        3. 程序的入口是main()方法。格式是固定的。<p>

        4. 输出语句：<p>
        System.out.println():先输出数据，然后换行 <p>
        System.out.print():只输出数据    <p>

        5.每一行执行语句都以";"结束。   <p>

        6.编译的过程：编译以后，会生成一个或多个字节码文件。字节码文件的文件名与java源文件中的类名相同。<p>

*/
    public static void main(String[] args) {//public static void main(String a[]) {//arguments:参数
        System.out.print("Hello World!");
        System.out.println();//换行
        System.out.println("Hello World!");
    }


}

class Person{}

class Animal{}
