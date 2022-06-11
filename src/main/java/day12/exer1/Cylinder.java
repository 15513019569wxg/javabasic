package day12.exer1;

/**
 * @author capensis
 */
public class Cylinder extends Circle{
	/** 高 */
	private double length;
	
	public Cylinder(){
		length = 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	/** 返回圆柱的体积 */
	public double findVolume(){
//		return Math.PI * getRadius() * getRadius() * getLength();
		return super.findArea() * getLength();
	}

	/** 返回圆柱的表面积 */
	@Override
	public double findArea() {
		return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
	}

}
