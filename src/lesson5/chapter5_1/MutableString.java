package lesson5.chapter5_1;

public class MutableString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello ");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ׷��"Java"
		str.append("Java");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ׷��", crazyit.org""
		str.append(", crazyit.org");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

	}

}
