package lesson7.chapter7_2;

public class ConstrucorRecursion {
	ConstrucorRecursion cr;

	{
		cr = new ConstrucorRecursion();
	}

	public ConstrucorRecursion() {
		System.out.println("ִ���޲����Ĺ�����");
	}

	public static void main(String[] args) {
		new ConstrucorRecursion();
	}

}
