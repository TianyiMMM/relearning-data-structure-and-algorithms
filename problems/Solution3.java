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
class Solution3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a1 = Node2Int(l1);
        int a2 = Node2Int(l2);
        int a = a1+a2;
        System.out.println(a1+" "+a2);
        return Int2Node(a);
    }

    public ListNode addTwoNumbers_method2(){
        ListNode ans = new ListNode();
        boolean firstTime = true;
        int carry = 0;
        ListNode node1 = l1, node2 = l2;
        while (node1!=null || node2 != null){
            int a1 = 0, a2 = 0;
            if (node1!=null){
                a1 = node1.val;
                node1 = node1.next;
            }
            if (node2!=null){
                a2 = node2.val;
                node2 = node2.next;
            }
            int a = a1+a2+carry;
            carry = 0;
            if (a-10 >= 0){
                carry = 1;
                a = a % 10;
            }
            ListNode node = new ListNode(a);
            ListNode tail = ans;
            while (tail.next!=null){
                tail = tail.next;
            }
            tail.next = node;
            printNode(ans);
        }
        if (carry > 0) {
            ListNode node = new ListNode(carry);
            ListNode tail = ans;
            while (tail.next!=null){
                tail = tail.next;
            }
            tail.next = node;
        }
        return ans.next;
    }
    public void printNode(ListNode first){
        ListNode node = first;
        while (node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
    }
    
    public int Node2Int(ListNode l){
        int count = 0;
        int a = 0;
        while (l!=null){
            int c = (int)(l.val*Math.pow(10,count));
            a+=c;
            count++;
            l = l.next;
            System.out.println(a+" "+c);
        }
        return a;
    }
    public ListNode Int2Node(int a_int){
        String a = String.valueOf(a_int);
        ListNode first = new ListNode();
        for (int i = 0; i < a.length(); i++){
            char d = a.charAt(i);
            int digit = Character.getNumericValue(d);
            ListNode node = new ListNode(digit);
            if (i == 0){
                first = node;
            } else {
                node.next = first;
                first = node;
            }
        }
        return first;
    }
}