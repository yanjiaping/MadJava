package lesson5.chapter5_1;

public class StringJoinTest2 {

	public static void main(String[] args) {
		String str1 = "Hello Java�ĳ���:10";
		// ��Ϊstr2��ֵ�����˷������ã���˲����ڱ���ʱȷ��
		String str2 = "Hello " + "Java" + "�ĳ���:" + "Hello Java".length();
		System.out.println(str1 == str2);
		int len = 10;
		//��Ϊstr3��ֵ�����˱�������˲����ڱ���ʱȷ��
		String str3 = "Hello " + "Java" + "�ĳ���:" + len;
		System.out.println(str1 == str3);
	}

}
