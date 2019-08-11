package lesson7.chapter7_4;

public class OverrideTest3 {
	public void info(Object obj, double count) {
		System.out.println("obj");
	}

	public void info(Object[] objs, double count) {
		System.out.println("objs");
	}

	public static void main(String[] args) {
		new OverrideTest3().info(null, 5);
	}

}
