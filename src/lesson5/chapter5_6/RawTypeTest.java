package lesson5.chapter5_6;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("���Java����");
		list.add("������Java EE��ҵӦ��ʵս");
		list.add("���Ajax����");

		List<Integer> intList = list;
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}

}
