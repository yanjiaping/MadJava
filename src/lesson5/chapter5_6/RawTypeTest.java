package lesson5.chapter5_6;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("疯狂Java讲义");
		list.add("轻量级Java EE企业应用实战");
		list.add("疯狂Ajax讲义");

		List<Integer> intList = list;
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}

}
