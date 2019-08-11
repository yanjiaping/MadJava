package lesson1.chapter1_1;

public class ReferenceArrayTest {

	public static void main(String[] args) {
		Person[] students;
		students = new Person[2];
		System.out.println("students�����õ�����ĳ����ǣ�" + students.length);
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
		System.out.println("�ҵ������ǣ�" + age + "���ҵ�����ǣ�" + height);
	}
}