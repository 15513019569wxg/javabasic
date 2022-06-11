package day15.java1;


/**
 * @author capensis
 */
public class StaticProxyTest {
	public static void main(String[] args) {
		Proxy s = new Proxy(new RealStar());
		s.confer();
		s.signContract();
		s.bookTicket();
		s.sing();
		s.collectMoney();
	}
}

interface Star {
	/** 面谈 */
	void confer();
	/** 签合同 */
	void signContract();
	/** 订票 */
	void bookTicket();
	/** 唱歌 */
	void sing();
	/** 收钱 */
	void collectMoney();
}
/** 被代理类 */
class RealStar implements Star {
	@Override
	public void confer() {}

	@Override
	public void signContract() {}

	@Override
	public void bookTicket() {}

	@Override
	public void sing() {
		System.out.println("明星：歌唱");
	}

	@Override
	public void collectMoney() {}
}

/** 代理类 */
class Proxy implements Star {
	private final Star real;
	public Proxy(Star real) {
		this.real = real;
	}

	@Override
	public void confer() {
		System.out.println("经纪人面谈");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人签合同");
	}

	@Override
	public void bookTicket() {
		System.out.println("经纪人订票");
	}

	@Override
	public void sing() {
		real.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人收钱");
	}
}
