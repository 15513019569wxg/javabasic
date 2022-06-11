package day16.exer;

/** 自定义异常类
 * @author capensis*/
public class EcDefException extends Exception {
	static final long serialVersionUID = -33875164229948L;

	public EcDefException() {
	}

	public EcDefException(String msg) {
		super(msg);
	}
}
