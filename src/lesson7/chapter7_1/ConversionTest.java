package lesson7.chapter7_1;

public class ConversionTest {

	public static void main(String[] args) {
		Object obj = "Hello";
		//obj�����ı�������ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//����obj����ʵ�������õ�Ҳ��String������������ʱҲ����
		String objStr = (String) obj;
		System.out.println(objStr);

		//����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		String str = (String) objPri;
		
		String s = "���Java����";
//		Math math = (Math)s;
	}

}
