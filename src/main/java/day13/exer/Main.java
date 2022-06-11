package day13.exer;

/**
 * 多态性
 * <pre>
 * 1.静态绑定/编译时绑定/早期绑定/方法重载。(在同一类中)
 * 2.动态绑定/运行时绑定/后期绑定/方法覆盖。(在不同的类中)
 * @author capensis
 */
public class Main {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.age);
        //java当中的方法final，static，private和构造方法是前期绑定
        Father.name();
        father.age();
    }
}

class Father {
    public int age = 60;

    public static void name() {
        System.out.println("father name");
    }

    public void age() {
        System.out.println("father age:" + age);
    }
}

class Son extends Father {
    public int age = 25;

    public static void name() {
        System.out.println("son name");
    }

    @Override
    public void age() {
        System.out.println("Son age:" + age);
    }
}