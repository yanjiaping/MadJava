package lesson7.chapter7_7;
class Animal {
	public static void info() {
		System.out.println("Animal��info����");
	}
}
public class Wolf extends Animal {

	public static void info() {
		System.out.println("Wolf��info����");
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.info();
		
		Animal a2 = new Wolf();
		a2.info();

	}

}
