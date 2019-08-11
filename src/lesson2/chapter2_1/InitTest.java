package lesson2.chapter2_1;

class Cat {
	String name;
	int age;

	public Cat(String name, int age) {
		System.out.println("执行构造器");
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println("执行非静态初始化块");
		weight = 2.0;
	}
	
	double weight = 2.3;

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}

public class InitTest {
	public static void main(String[] args) {
		Cat cat = new Cat("kitty", 2);
		System.out.println(cat);
		Cat c2 = new Cat("Jerfield", 3);
		System.out.println(c2);
	}
}
