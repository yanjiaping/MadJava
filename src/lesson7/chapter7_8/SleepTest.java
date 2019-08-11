package lesson7.chapter7_8;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(2);
		System.out.println(System.currentTimeMillis() - start);
	}

}
