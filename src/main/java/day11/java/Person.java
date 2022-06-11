package day11.java;

/**
 * @author wxg
 * @date 2022/4/13-15:03
 * @quotes 小不忍则乱大谋
 */
public class Person extends Creature{

    String name = "person";
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
    }

    /**
     * 私有的方法, 子类同样继承
     */
    private void sleep(){
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Person-age的值：" + age);
    }


}

