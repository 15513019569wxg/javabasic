package day15.exer1;
/**
 * 对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 * @author capensis
 */
public class Manager extends Employee{
	/** 子类特有的属性： 奖金 */
	private final double bonus;
	
	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("管理员工，提供公司运行的效率");
	}
	
}
