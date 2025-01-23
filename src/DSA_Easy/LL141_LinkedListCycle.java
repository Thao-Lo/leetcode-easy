package DSA_Easy;

import LinkedList.Node;

public class LL141_LinkedListCycle {

	public static void main(String[] args) {

	}
	//solve problem using Set
	//store all node in the set then loop again On2 time On space
	
	// O1 memory
	//Floyd's Cycle detection alg - tho rua
	public static boolean hasCycle(Node head) {
		if (head == null || head.next == null) {
			return false;
		}

		Node oneStep = head;
		Node twoStep = head;
		while (twoStep != null && twoStep.next != null) {
			//1 node at a time
			oneStep = oneStep.next;
			//2 node at a time
			twoStep = twoStep.next.next;
			//if there is a cycle, twoStep will meet oneStep at next round
			if(oneStep == twoStep) {
				return true;
			}
		}

		return false;
	}
	
	//Time Limit error
	public static boolean hasCycle1(Node head) {
		if (head == null || head.next == null) {
			return false;
		}

		Node current = head;		
		while (current != null && current.next != null) {
			//reset node temp 
			Node temp = head;
			
			//run from head to current again when current moving
			while (temp != current) {
				if(temp == current.next) {
					return true;
				}
				temp = temp.next;
			}
			current = current.next;
		}

		return false;
	}

}
