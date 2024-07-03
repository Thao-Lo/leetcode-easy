package LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.prepend(2);
		list.append(3);
		list.append(5);
		
		list.printList();
	}

}
