package day14.exer1;

/**
 * @author capensis
 */
public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }


    public int addOne(final int x) {
        // return ++x; 编译报错
         return x + 1;
    }

    /**
     * 可以修改final类的成员属性
     * @param o  final类
     */
    public void addOne(final Other o) {
    // o = new Other();  不可以再进行赋值
        o.i++;
    }
}


class Other {
    public int i;
}