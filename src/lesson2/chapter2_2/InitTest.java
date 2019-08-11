package lesson2.chapter2_2;

class Creature {
	{
		System.out.println("Creature的非静态初始化块");
	}

	// 定义两个构造器
	public Creature() {
		System.out.println("Creature无参数的构造器");
	}

	public Creature(String name) {
		this();
		System.out.println("Creature带有name参数的构造器，name参数：" + name);
	}
}

class Animal extends Creature {
	{
		System.out.println("Animal的非静态初始化块");
	}

	public Animal(String name) {
		super(name);
		System.out.println("Animal带1个参数的构造器，name参数：" + name);
	}

	public Animal(String name, int age) {
		this(name);
		System.out.println("Animal带2个参数的构造器，其age：" + age);
	}
}

class Wolf extends Animal {
	{
		System.out.println("Wolf的非静态初始化块");
	}

	public Wolf() {
		super("灰太狼", 3);
		System.out.println("Wolf无参数的构造器");
	}

	public Wolf(double weight) {
		this();
		System.out.println("Wolf带有weight参数的构造器，weight参数：" + weight);
	}
}

public class InitTest {

	public static void main(String[] args) {
		new Wolf(5.6);

	}

}
