package DSA_Easy;

public class RemoverDuplicate83 {

	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		
		ListNode before = list;
		while (before != null) {
			System.out.println("before" + before.val);
			System.out.println(before.next);
			before = before.next;
		}
		ListNode noDuplicateList = deleteDuplicate(list);
		ListNode current = noDuplicateList;
		while (current != null) {
			System.out.println(current.val);
			System.out.println(current.next);
			current = current.next;
		}

	}

	public static ListNode deleteDuplicate(ListNode list) {
		if(list == null) {
			return null;
		}		
		ListNode current = list;			
		
	   while(current.next != null && current != null) {
		   if(current.next.val == current.val) {
			   current.next = current.next.next;
		   }else {
			   current = current.next;
		   }
		 
	   }
	   
	   //garbage collection, remove ListNode that no longer reference to (from leetcode) 
	   //java virtual machine'll handle it without calling method, but for submmitting on leetcode only 
	   System.gc();
		return list;
	}

}


