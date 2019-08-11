package lesson2.chapter2_3;

class Fruit {
	String color = "未确定颜色";

	public Fruit getThis() {
		return this;
	}

	public void info() {
		System.out.println("Fruit方法");
	}
}

public class Apple extends Fruit {
	String color = "红色";

	@Override
	public void info() {
		System.out.println("Apple方法");
	}

	// 调用父类info方法
	public void accessSuperInfo() {
		super.info();
	}

	// 调用父类getThis方法
	public Fruit getSuper() {
		return super.getThis();
	}

	public static void main(String[] args) {
		Apple a = new Apple();
		Fruit f = a.getSuper();
		System.out.println("a和f所引用的对象是否相同：" + (a == f));
		System.out.println("访问a所引用对象的color实例变量：" + a.color);
		System.out.println("访问f所引用对象的color实例变量：" + f.color);
		a.info();
		f.info();
		a.accessSuperInfo();
	}

}
