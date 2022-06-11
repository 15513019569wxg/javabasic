package day15.java;
/**
 * 抽象类的应用：模板方法的设计模式
 * @author capensis
 */
public class TemplateMethodTest {

	public static void main(String[] args) {
		AbstractBankTemplateMethod btm = new DrawMoney();
		btm.process();

		AbstractBankTemplateMethod btm2 = new ManageMoney();
		btm2.process();
	}
}
abstract class AbstractBankTemplateMethod {
	/** 具体方法 */
	public void takeNumber() {
		System.out.println("取号排队");
	}

	/** 办理具体的业务 //钩子方法 */
	public abstract void transact();

	public void evaluate() {
		System.out.println("反馈评分");
	}

	/** 模板方法，把基本操作组合到一起，子类一般不能重写 */
	public final void process() {
		this.takeNumber();

		// 像个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现代码
		this.transact();

		this.evaluate();
	}
}

class DrawMoney extends AbstractBankTemplateMethod {
	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
}

class ManageMoney extends AbstractBankTemplateMethod {
	@Override
	public void transact() {
		System.out.println("我要理财！我这里有2000万美元!!");
	}
}
