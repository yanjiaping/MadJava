package lesson2.chapter2_4;

public class FinalInitTest {
	final String str1;
	final String str2;
	final String str3 = "Java";

	// str1��str2�ֱ��ڷǾ�̬��ʼ����͹������г�ʼ��
	{
		str1 = "Java";
	}

	public FinalInitTest() {
		str2 = "Java";
	}

	// �ж�str1��str2��str3�Ƿ�ִ���ˡ����滻��
	public void display() {
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");
		System.out.println(str3 + str3 == "JavaJava");
	}

	public static void main(String[] args) {
		new FinalInitTest().display();
	}

}
