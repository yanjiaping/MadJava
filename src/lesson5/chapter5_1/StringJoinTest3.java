package lesson5.chapter5_1;

public class StringJoinTest3 {

	public static void main(String[] args) {
		String str1 = "Hello Java的长度:10";
		// 因为str2的值包含了方法调用，因此不能在编译时确定
		final String s1 = "Hello ";
		String str2 = s1 + "Java" + "的长度:10";
		System.out.println(str1 == str2);
		final int len = 10;
		//因为str3的值包含了变量，因此不能在编译时确定
		String str3 = "Hello " + "Java" + "的长度:" + len;
		System.out.println(str1 == str3);
	}

}
