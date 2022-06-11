package day12.exer1;

/**
 * @author capensis
 */
public class Circle {
	/** 半径 */
	private double radius;
	
	public Circle(){
		radius = 1.0;
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** 返回圆的面积 */
	public double findArea(){
		System.out.println("radius " + radius);
		return Math.PI * radius * radius;

	}
	
}
