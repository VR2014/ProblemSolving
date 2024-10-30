package functional.interfaces;

import java.util.stream.LongStream;

public class Parallelizing {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println(time);
		System.out.println(LongStream.range(0, 1000000).parallel().sum());
		long end=System.currentTimeMillis();
		System.out.println(end-time);
	}

}
