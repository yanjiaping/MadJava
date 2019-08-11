package lesson2.chapter2_3;

class Base1 {
	int count = 2;
}

class Mid extends Base1 {
	int count = 20;
}

public class Sub extends Mid {
	int count = 200;

	public static void main(String[] args) {
		Sub s = new Sub();
		Mid s2m = s;
		Base1 s2b = s;

		System.out.println(s.count);
		System.out.println(s2m.count);
		System.out.println(s2b.count);

	}

}
