package lesson5.chapter5_1;

public class StringJoinTest3 {

	public static void main(String[] args) {
		String str1 = "Hello Java�ĳ���:10";
		// ��Ϊstr2��ֵ�����˷������ã���˲����ڱ���ʱȷ��
		final String s1 = "Hello ";
		String str2 = s1 + "Java" + "�ĳ���:10";
		System.out.println(str1 == str2);
		final int len = 10;
		//��Ϊstr3��ֵ�����˱�������˲����ڱ���ʱȷ��
		String str3 = "Hello " + "Java" + "�ĳ���:" + len;
		System.out.println(str1 == str3);
	}

}
