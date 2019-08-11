package lesson2.chapter2_2;

class Base {
	private int i = 2;

	public Base() {
		System.out.println("我是Base类的构造器");
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
		System.out.println("我是Derived类的构造器");
		i = 222;
	}

	public void display() {
		System.out.println(i);
	}

	public void sub() {
		System.out.println("我是Derived类的sub方法");
	}
}

public class Test {

	public static void main(String[] args) {
		new Derived();

	}

}
