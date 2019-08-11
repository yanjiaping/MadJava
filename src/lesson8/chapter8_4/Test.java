package lesson8.chapter8_4;

import javax.xml.crypto.NoSuchMechanismException;

interface Type1 {
	void test() throws ClassNotFoundException;
}

interface Type2 {
	void test() throws NoSuchMechanismException;
}

public class Test implements Type1, Type2 {

	public static void main(String[] args) {
		new Test().test();
	}

	@Override
	public void test() /*throws ClassNotFoundException,NoSuchMechanismException*/ {
		System.out.println("www.crazyit.org");
	}

}
