package lesson2.chapter2_1;

class Person {
	String name;
	int age;
	static int eyeNum;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println("我的名字是：" + name + "，我的年龄是：" + age);
	}
}

public class FieldTest {

	public static void main(String[] args) {
		Person.eyeNum = 2;

		System.out.println("Person的eyeNum属性：" + Person.eyeNum);

		Person p = new Person("猪八戒", 300);
		System.out.println("通过p变量访问eyeNum类变量：" + p.eyeNum);
		p.info();

		Person p2 = new Person("孙悟空", 500);
		p2.info();
		p2.eyeNum = 3;

		System.out.println("通过p变量访问eyeNum类变量：" + p.eyeNum);
		System.out.println("通过p2变量访问eyeNum类变量：" + p2.eyeNum);
		System.out.println("通过Person类访问eyeNum类变量：" + Person.eyeNum);
	}

}
