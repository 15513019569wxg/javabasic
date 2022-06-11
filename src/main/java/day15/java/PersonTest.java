package day15.java;

/**
 * 抽象类的匿名子类
 *
 * @author capensis
 */
public class PersonTest {
    public static void main(String[] args) {
        //匿名对象
        method(new Student());
        Worker worker = new Worker();
        /* 非匿名的类非匿名的对象 */
        method1(worker);
        /* 非匿名的类匿名的对象 */
        method1(new Worker());
        System.out.println("********************");

        //创建了一匿名子类的对象：p
        AbstractPerson p = new AbstractPerson() {

            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸");
            }

        };

        method1(p);
        System.out.println("********************");
        //创建匿名子类的匿名对象
        method1(new AbstractPerson() {
            @Override
            public void eat() {
                System.out.println("吃好吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸新鲜空气");
            }
        });
    }


    public static void method1(AbstractPerson p) {
        p.eat();
        p.breath();
    }

    public static void method(Student s) {}
}

class Worker extends AbstractPerson {
    @Override
    public void eat() {}

    @Override
    public void breath() {}

}
