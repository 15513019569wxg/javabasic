package day15.java;

/**
 * @author capensis
 */
@SuppressWarnings("ConstantConditions")
public class SingletonTest {
	public static void main(String[] args) {
		Bank bank1 = Bank.INSTANCE;
//		Bank.instance = null;
		Bank bank2 = Bank.INSTANCE;
		System.out.println(bank1 == bank2);
	}
}

@SuppressWarnings("InstantiationOfUtilityClass")
class Bank{
	private Bank(){}
	public static final Bank INSTANCE = new Bank();
	
}
