package lesson5.chapter5_1;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("z");
		String s3 = new String("abc");
		// ͨ��compareTo�Ƚ��ַ����Ĵ�С
		if (s1.compareTo(s3) == 0) {
			System.out.println("s1��s3�������ַ��������");
		}
		if (s1.compareTo(s2) < 0) {
			System.out.println("s1<s2");
		}
		// ͨ��equals�Ƚ��ַ����������ַ������Ƿ���ͬ
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);

	}

}
