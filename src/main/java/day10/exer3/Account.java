package day10.exer3;

/**
 * @author capensis
 */
public class Account {
	/** 账号 */
	private int id;
	/** 余额 */
	private double balance;
	/** 年利率 */
	private double annualInterestRate;
	
	public Account (int id, double balance, double annualInterestRate ){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** 在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。 */
	public void withdraw (double amount){//取钱
		if(balance < amount){
			System.out.println("余额不足，取款失败");
			return;
		}
		balance -= amount;
		System.out.println("成功取出：" + amount);
	}

	/**
	 * @param amount	存钱数目
	 */
	public void deposit (double amount){//存钱
		if(amount > 0){
			balance += amount;
			System.out.println("成功存入：" + amount);
		}
	}

}
