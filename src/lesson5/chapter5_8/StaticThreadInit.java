package lesson5.chapter5_8;

public class StaticThreadInit {
	static {
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("����run����");
				System.out.println(website);
				website = "www.leegang.org";
				System.out.println("�˳�run����");
			}
		};
		t.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	static String website = "www.crazyit.org";

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " " + StaticThreadInit.website);
	}

}
