package lesson7.chapter7_4;

public class OverrideTest4 {
	public void info(Object obj, int count) {
		System.out.println("obj");
	}

	public void info(Object[] objs, double count) {
		System.out.println("objs");
	}

	public static void main(String[] args) {
//		new OverrideTest4().info(null, 5);
	}

}
