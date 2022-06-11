package day12.exer2;
/**
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * <pre>
 * 在CheckAccount类中重写withdraw方法，其算法如下：
        如果取款金额 < 账户余额，可直接取款
        如果取款金额> 账户余额，计算需要透支的额度
        判断可透支额overdraft是否足够支付本次透支需要，
            如果可以,将账户余额修改为0，冲减可透支金额
            如果不可以,提示用户超过可透支额的限额
 * @author capensis
 */
public class CheckAccount extends Account{
	
	/** 可透支限额 */
	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		//余额就足够消费
		if(getBalance() >= amount){
//			getBalance() -= amount;
			//方式一：
//			setBalance(getBalance() - amount); 
			//方式二：
			super.withdraw(amount);
		//透支额度+余额足够消费
		}else if(overdraft >= amount - getBalance()){
			
			overdraft -= (amount - getBalance());
			
//			setBalance(0);
			//或
			super.withdraw(getBalance());
			
		}else{
			System.out.println("超过可透支限额！");
		}
	}

}
