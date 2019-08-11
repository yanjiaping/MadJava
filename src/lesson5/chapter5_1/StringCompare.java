package lesson5.chapter5_1;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("z");
		String s3 = new String("abc");
		// 通过compareTo比较字符串的大小
		if (s1.compareTo(s3) == 0) {
			System.out.println("s1和s3包含的字符序列相等");
		}
		if (s1.compareTo(s2) < 0) {
			System.out.println("s1<s2");
		}
		// 通过equals比较字符串包含的字符序列是否相同
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);

	}

}
