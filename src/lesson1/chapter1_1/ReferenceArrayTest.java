package lesson1.chapter1_1;

public class ReferenceArrayTest {

	public static void main(String[] args) {
		Person[] students;
		students = new Person[2];
		System.out.println("students所引用的数组的长度是：" + students.length);
		Person zhang = new Person(15, 158);
		Person lee = new Person(16, 161);
		students[0] = zhang;
		students[1] = lee;
		lee.info();
		students[1].info();
	}
}

class Person {
	public int age;
	public double height;

	public Person(int age, double height) {
		super();
		this.age = age;
		this.height = height;
	}

	public void info() {
		System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
	}
}