package lesson2.chapter2_4;

public class FinalTest {

	public static void main(String[] args) {
		// ������4��final���������
		final int a = 5 + 2;
		final double b = 1.2 / 3;
		final String str = "���" + "Java";
		final String book = "���Java���壺" + 99.0;

		// book2������ֵ��Ϊ�����˷����������޷��ڱ���ʱ��ȷ������
		final String book2 = "���Java���壺" + String.valueOf(99.0);

		System.out.println(book == "���Java���壺99.0");
		System.out.println(book2 == "���Java���壺99.0");
	}

}
