package lesson2.chapter2_4;

public class FinalInitTest {
	final String str1;
	final String str2;
	final String str3 = "Java";

	// str1和str2分别在非静态初始化块和构造器中初始化
	{
		str1 = "Java";
	}

	public FinalInitTest() {
		str2 = "Java";
	}

	// 判断str1、str2、str3是否执行了“宏替换”
	public void display() {
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");
		System.out.println(str3 + str3 == "JavaJava");
	}

	public static void main(String[] args) {
		new FinalInitTest().display();
	}

}
