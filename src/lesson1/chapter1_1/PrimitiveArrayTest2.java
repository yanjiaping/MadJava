package lesson1.chapter1_1;

public class PrimitiveArrayTest2 {

	public static void main(String[] args) {
		// 定义一个int[]类型的数组变量
		int[] iArr = null;
		// 只要不访问iArr的属性和方法，程序完全可以使用该数组变量
		System.out.println(iArr);
		// 动态初始化数组，数组长度为5
		iArr = new int[5];
		// 只有当iArr指向有效的数组对象后，才可以方法iArr的属性
		System.out.println(iArr.length);
	}
}
