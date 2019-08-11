package lesson2.chapter2_2;

class Base {
	private int i = 2;

	public Base() {
		System.out.println("����Base��Ĺ�����");
		System.out.println(this.i);
		this.display();
		System.out.println(this.getClass());
//		this.sub();
	}

	public void display() {
		System.out.println(i);
	}

}

class Derived extends Base {
	private int i = 22;

	public Derived() {
		System.out.println("����Derived��Ĺ�����");
		i = 222;
	}

	public void display() {
		System.out.println(i);
	}

	public void sub() {
		System.out.println("����Derived���sub����");
	}
}

public class Test {

	public static void main(String[] args) {
		new Derived();

	}

}
