package day14.java2;

import java.util.stream.IntStream;

/**
 * @author capensis
 */
public class MainDemo {
	
	public static void main(String[] args) {
		IntStream.range(0, args.length).forEach(i -> {
			System.out.println("*****" + args[i]);
			int num = Integer.parseInt(args[i]);
			System.out.println("#####" + num);
		});
	}
	
}
