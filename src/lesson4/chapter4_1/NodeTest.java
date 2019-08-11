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
		Node n1 = new Node("第一个节点");
		Node n2 = new Node("第二个节点");
		Node n3 = new Node("第三个节点");
		n1.next = n2;
		n2 = null;
		n3 = n2;
	}

}
