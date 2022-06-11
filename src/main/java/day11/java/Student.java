package day11.java;

/**
 * @author wxg
 * @date 2022/4/13-15:04
 * @quotes 小不忍则乱大谋
 */
public class Student extends Person {

    String name;
    int age = 20;
    String major;

    public Student() {}

    public Student(String name, int age, String major) {
        this.name = name;
        //this.age = age;
        // 说明父类person的私有属性age还是被子类Student继承了, 只是不能直接访问
        setAge(age);
        this.major = major;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("学生应该注意营养均衡");
    }

    /**
     * 这里的sleep()方法是Student类特有的方法, 由于父类的sleep()是私有的，无法访问
     */
    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
        // 无法访问从父类那里继承的私有属性age
        System.out.println("age: " + age);
    }

    public void show() {
        System.out.println("name:" + name + ",age:" + getAge());
    }

}

