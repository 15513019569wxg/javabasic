package day10.java;

/**
 * @author capensis
 */
public class Order {
    public int orderPublic;
    int orderDefault;
    private int orderPrivate;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}
