package annotation;

import java.util.ArrayList;

/**
 * @author capensis
 */
public class AnnotationTest {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int num = 10;
		@SuppressWarnings({ "unused", "rawtypes" })
		ArrayList list = new ArrayList();
		
	}
}
