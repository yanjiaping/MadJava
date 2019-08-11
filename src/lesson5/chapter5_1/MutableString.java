package lesson5.chapter5_1;

public class MutableString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello ");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ×·¼Ó"Java"
		str.append("Java");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ×·¼Ó", crazyit.org""
		str.append(", crazyit.org");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

	}

}
