package lesson2.chapter2_2;

class Creature {
	{
		System.out.println("Creature�ķǾ�̬��ʼ����");
	}

	// ��������������
	public Creature() {
		System.out.println("Creature�޲����Ĺ�����");
	}

	public Creature(String name) {
		this();
		System.out.println("Creature����name�����Ĺ�������name������" + name);
	}
}

class Animal extends Creature {
	{
		System.out.println("Animal�ķǾ�̬��ʼ����");
	}

	public Animal(String name) {
		super(name);
		System.out.println("Animal��1�������Ĺ�������name������" + name);
	}

	public Animal(String name, int age) {
		this(name);
		System.out.println("Animal��2�������Ĺ���������age��" + age);
	}
}

class Wolf extends Animal {
	{
		System.out.println("Wolf�ķǾ�̬��ʼ����");
	}

	public Wolf() {
		super("��̫��", 3);
		System.out.println("Wolf�޲����Ĺ�����");
	}

	public Wolf(double weight) {
		this();
		System.out.println("Wolf����weight�����Ĺ�������weight������" + weight);
	}
}

public class InitTest {

	public static void main(String[] args) {
		new Wolf(5.6);

	}

}
