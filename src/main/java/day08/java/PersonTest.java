package day08.java;

/**
 * @author capensis <p>
 *
 * 一、设计类，其实就是设计类的成员
 *<blockquote>
     *   属性 = 成员变量 = field = 域、字段    <p>
     *  方法 = 成员方法 = 函数 = method     <p>
     *  创建类的对象 = 类的实例化 = 实例化类
 *</blockquote>
 *
 * 二、类和对象的使用（面向对象思想落地的实现）：
 * <blockquote>
        1.创建类，设计类的成员    <p>
        2.创建类的对象            <p>
        3.通过“对象.属性”或“对象.方法”调用对象的结构
 * </blockquote>

 * 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static的）
    <blockquote><pre>
        意味着：如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值。
    </pre></blockquote>

 *
 * 四、对象的内存解析    <p>
 */

public class PersonTest {
    public static void main(String[] args) {
        //2. 创建Person类的对象
        Person p1 = new Person();
        //Scanner scanner = new Scanner(System.in);
        //调用对象的结构：属性、方法
        //调用属性：“对象.属性”
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        //调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        System.out.println("=============================================");
        //*******************************
        Person p2 = new Person();
        //null
        System.out.println(p2.name);
        System.out.println(p2.isMale);
        //*******************************
        //将p1变量保存的对象地址值赋给p3,导致p1和p3指向了堆空间中的同一个对象实体。
        Person p3 = p1;
        //Tom
        System.out.println(p3.name);
        p3.age = 10;
        //10
        System.out.println(p1.age);

    }
}

//1.创建类，设计类的成员
@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
class Person {
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话,使用的是：" + language);
    }

}
