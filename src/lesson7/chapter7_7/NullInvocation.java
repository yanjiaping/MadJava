package lesson7.chapter7_7;

public class NullInvocation {
	public static void info() {
		System.out.println("¾²Ì¬µÄinfo·½·¨");
	}

	public static void main(String[] args) {
		NullInvocation ni = null;
		ni.info();
	}

}
