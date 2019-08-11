package lesson7.chapter7_1;

public class ConversionTest {

	public static void main(String[] args) {
		Object obj = "Hello";
		//obj变量的编译类型为Object，是String类型的父类，可以强制类型转换
		//而且obj变量实际上引用的也是String对象，所以运行时也正常
		String objStr = (String) obj;
		System.out.println(objStr);

		//定义一个objPri变量，编译类型为Object，实际类型为Integer
		Object objPri = new Integer(5);
		String str = (String) objPri;
		
		String s = "疯狂Java讲义";
//		Math math = (Math)s;
	}

}
