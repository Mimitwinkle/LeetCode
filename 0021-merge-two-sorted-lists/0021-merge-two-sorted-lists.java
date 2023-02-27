/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Use a dummy to start the new linked list
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                // Make current point to list1
                current.next = list1;
                // Move down list1
                list1 = list1.next;
            }
            else {
                // Make current point to list2
                current.next = list2;
                // Move down list2
                list2 = list2.next;
            }
            // Move down new linked list
            current = current.next;
        }
        current.next = list1 != null ? list1 : list2;
        return dummy.next;
    }
}