package day15.exer3;
/**

 * @author capensis
 */
public interface CompareObject {
/**
 * 若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 * <pre>
 * interface CompareObject{
 * 		public int compareTo(Object o);
 *  }
 * @param o 待比较对象
 * @return int 大小
 */
	int compareTo(Object o);
}
