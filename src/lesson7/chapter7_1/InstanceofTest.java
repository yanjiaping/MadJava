package lesson7.chapter7_1;

import java.io.Serializable;

public class InstanceofTest {

	public static void main(String[] args) {
		Object hello = "Hello";
		System.out.println("�ַ����Ƿ���Object���ʵ����" + (hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ����" + (hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ����" + (hello instanceof Math));
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����" + (hello instanceof Comparable));

		String str = "Hello";
//		System.out.println("�ַ����Ƿ���Math���ʵ����" + (str instanceof Math));
		System.out.println("�ַ����Ƿ���Serializable���ʵ����" + (str instanceof Serializable));
	}

}
