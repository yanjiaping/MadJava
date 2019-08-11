package lesson7.chapter7_2;

public class ConstrucorRecursion {
	ConstrucorRecursion cr;

	{
		cr = new ConstrucorRecursion();
	}

	public ConstrucorRecursion() {
		System.out.println("执行无参数的构造器");
	}

	public static void main(String[] args) {
		new ConstrucorRecursion();
	}

}
