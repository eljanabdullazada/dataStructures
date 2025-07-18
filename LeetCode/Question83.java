package LeetCode;

import static LeetCode.ListNode.printList;

public class Question83 {
    public static void main(String[]args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        printList(head);
        deleteDuplicates(head);
        printList(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}
