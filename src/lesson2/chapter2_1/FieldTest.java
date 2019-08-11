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
		System.out.println("�ҵ������ǣ�" + name + "���ҵ������ǣ�" + age);
	}
}

public class FieldTest {

	public static void main(String[] args) {
		Person.eyeNum = 2;

		System.out.println("Person��eyeNum���ԣ�" + Person.eyeNum);

		Person p = new Person("��˽�", 300);
		System.out.println("ͨ��p��������eyeNum�������" + p.eyeNum);
		p.info();

		Person p2 = new Person("�����", 500);
		p2.info();
		p2.eyeNum = 3;

		System.out.println("ͨ��p��������eyeNum�������" + p.eyeNum);
		System.out.println("ͨ��p2��������eyeNum�������" + p2.eyeNum);
		System.out.println("ͨ��Person�����eyeNum�������" + Person.eyeNum);
	}

}
