package lesson3.chapter3_4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("111");
		list.add("222");
		list.add("333");
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String str = it.next();
			if(str.equals("111")) {
				list.remove(str);
			}
		}
		System.out.println(123);
	}

}
