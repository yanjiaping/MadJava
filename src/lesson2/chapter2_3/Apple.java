package lesson2.chapter2_3;

class Fruit {
	String color = "δȷ����ɫ";

	public Fruit getThis() {
		return this;
	}

	public void info() {
		System.out.println("Fruit����");
	}
}

public class Apple extends Fruit {
	String color = "��ɫ";

	@Override
	public void info() {
		System.out.println("Apple����");
	}

	// ���ø���info����
	public void accessSuperInfo() {
		super.info();
	}

	// ���ø���getThis����
	public Fruit getSuper() {
		return super.getThis();
	}

	public static void main(String[] args) {
		Apple a = new Apple();
		Fruit f = a.getSuper();
		System.out.println("a��f�����õĶ����Ƿ���ͬ��" + (a == f));
		System.out.println("����a�����ö����colorʵ��������" + a.color);
		System.out.println("����f�����ö����colorʵ��������" + f.color);
		a.info();
		f.info();
		a.accessSuperInfo();
	}

}
