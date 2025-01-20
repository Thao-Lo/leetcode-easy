package HashMap;


public class MyHashMap {
// create an ListNode array called map, each index is null and must be a new ListNode object
// hash key by using modulus key % array.size 
// each index has 1 dummy node as the head 

	public static class ListNode {
		int key;
		int value;
		ListNode next;

		public ListNode(int key, int value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	public ListNode[] map;
	public final int SIZE = 10;

	public int hash(int key) {
		return key % SIZE;
	}

	public MyHashMap() {
		map = new ListNode[SIZE];
	}
	
// from each head/dummy node, travel through the list
//1st node is dummy, and key is -1 
//2nd node: if is null -> create new Node(key,value) 
//2nd node: not null and contains key? return the node before it (prev)
	public ListNode find(ListNode dummy, int key) {
		ListNode node = dummy;
		ListNode prev = null;
		while(node != null && node.key != key) {
			prev = node;
			node = node.next;
		}		
		return prev;
	}
	
	public void put(int key, int value) {
		int hashIndex = hash(key);
		if(map[hashIndex] == null) {
			map[hashIndex] = new ListNode(-1, -1);
		}
		ListNode prev = find(map[hashIndex], key);
		if(prev.next == null) {
			prev.next = new ListNode(key, value);
		}else {
			prev.next.value = value;
		}		
	}

	public int get(int key) {
		int hashIndex = hash(key);
		if(map[hashIndex] == null) {
			return -1;
		}
		ListNode prev = find(map[hashIndex], key);
		if(prev.next != null) {
			return prev.next.value;
		}
		return -1;
	}

	public void remove(int key) {
		int hashIndex = hash(key);
		if(map[hashIndex] == null) {
			return;
		}
		ListNode prev = find(map[hashIndex], key);
		if(prev.next != null) {
			prev.next = prev.next.next;
		}
	}

}
