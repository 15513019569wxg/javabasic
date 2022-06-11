package day15.java;

/**
 * @author capensis
 *         抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubAbstractTemplate t = new SubAbstractTemplate();
        t.spendTime();
    }
}

abstract class AbstractTemplate {
    /**
     * 计算某段代码执行所需要花费的时间
     */
    public void spendTime() {
        long start = System.currentTimeMillis();
        this.code();//不确定的部分、易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

    }

    /**
     * 具体代码
     */
    public abstract void code();
}

class SubAbstractTemplate extends AbstractTemplate {
    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }

}
