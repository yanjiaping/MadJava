package lesson2.chapter2_4;

public class ClosureTest {

	public static void main(String[] args) {
		String str = "Java";
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(str + " " + i);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

}
