package lesson7.chapter7_1;

import java.io.Serializable;

public class InstanceofTest {

	public static void main(String[] args) {
		Object hello = "Hello";
		System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));
		System.out.println("字符串是否是String类的实例：" + (hello instanceof String));
		System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));
		System.out.println("字符串是否是Comparable接口的实例：" + (hello instanceof Comparable));

		String str = "Hello";
//		System.out.println("字符串是否是Math类的实例：" + (str instanceof Math));
		System.out.println("字符串是否是Serializable类的实例：" + (str instanceof Serializable));
	}

}
