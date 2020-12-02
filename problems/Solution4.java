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
    public ListNode oddEvenList(ListNode head) {
        if (head!=null){
            ListNode odds = null;
            ListNode odds_last = null;
            ListNode evens = null;
            ListNode evens_last = null;
            ListNode node = head;
            int index = 0;
            while (node!=null){
                ListNode curr_node = new ListNode(node.val);
                if (index%2 == 0){
                    if (index == 0){
                        odds = curr_node;
                        odds_last = curr_node;
                    } else {
                        odds_last.next = curr_node;
                        odds_last = curr_node;
                    }
                } else {
                    if (index == 1){
                        evens = curr_node;
                        evens_last = curr_node;
                    } else {
                        evens_last.next = curr_node;
                        evens_last = curr_node;
                    }
                }
                index++;
                node = node.next;
            }
            odds_last.next = evens;
            return odds;
        } else {
            return null;
        }
    }
}