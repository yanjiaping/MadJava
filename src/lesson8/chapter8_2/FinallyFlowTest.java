package lesson8.chapter8_2;

public class FinallyFlowTest {

	public static void main(String[] args) {
		System.out.println(test());

	}

	public static int test() {
		int count = 5;
		try {
			return ++count;
		} finally {
			System.out.println("finally¿é±»Ö´ÐÐ");
			return count++;
		}
	}
}
