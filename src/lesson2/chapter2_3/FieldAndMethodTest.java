package lesson2.chapter2_3;

class Base {
	int count = 2;
	
	public void display() {
		System.out.println(this.count);
	}
}

class Derived extends Base {
	int count = 20;
	
	@Override
	public void display() {
		System.out.println(this.count);
	}
}

public class FieldAndMethodTest {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println(b.count);
		b.display();
		System.out.println("**************");
		
		Derived d = new Derived();
		System.out.println(d.count);
		d.display();
		System.out.println("**************");
		
		Base bd = new Derived();
		System.out.println(bd.count);
		bd.display();
		System.out.println("**************");
		
		Base d2b = d;
		System.out.println(d2b.count);
		d2b.display();
	}
}
