package lesson2.chapter2_4;

public class FinalTest {

	public static void main(String[] args) {
		// 定义了4个final“宏变量”
		final int a = 5 + 2;
		final double b = 1.2 / 3;
		final String str = "疯狂" + "Java";
		final String book = "疯狂Java讲义：" + 99.0;

		// book2变量的值因为调用了方法，所以无法在编译时被确定下来
		final String book2 = "疯狂Java讲义：" + String.valueOf(99.0);

		System.out.println(book == "疯狂Java讲义：99.0");
		System.out.println(book2 == "疯狂Java讲义：99.0");
	}

}
