package lesson4.chapter4_1;

class Node {
	Node next;
	String name;

	public Node(String name) {
		this.name = name;
	}

}

public class NodeTest {

	public static void main(String[] args) {
		Node n1 = new Node("��һ���ڵ�");
		Node n2 = new Node("�ڶ����ڵ�");
		Node n3 = new Node("�������ڵ�");
		n1.next = n2;
		n2 = null;
		n3 = n2;
	}

}
