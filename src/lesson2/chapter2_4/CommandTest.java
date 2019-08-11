package lesson2.chapter2_4;

import java.util.Arrays;

interface IntArrayProductor {
	int product();
}

public class CommandTest {
	public int[] process(IntArrayProductor cmd, int length) {
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = cmd.product();
		}
		return result;
	}

	public static void main(String[] args) {
		CommandTest ct = new CommandTest();
		final int seed = 5;

		int[] result = ct.process(new IntArrayProductor() {
			@Override
			public int product() {
				return (int) Math.round(Math.random() * seed);
			}
		}, 6);
		System.out.println(Arrays.toString(result));

	}

}
