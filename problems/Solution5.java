/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution5 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> storage = new HashMap();
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int index = 0;
        while (nodeB != null){
            storage.put(nodeB, index);
            nodeB = nodeB.next;
            index++;
        }
        nodeB = headB;
        while (nodeA != null){
            if (storage.containsKey(nodeA)){
                ListNode node = atIndex(nodeB, storage.get(nodeA));
                //System.out.println("contains: "+ nodeA.val+" "+node.val);
                //printNode(nodeB);
                //printNode(node);
                if (isIntersection(nodeA, node)){
                    return node;
                }
            }
            nodeA = nodeA.next;
        }
        return null;
    }
    
    public ListNode atIndex(ListNode head, int index){
        ListNode node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    
    public boolean isIntersection(ListNode nodeA, ListNode nodeB){
        ListNode nA = nodeA;
        ListNode nB = nodeB;
        boolean res = true;
        while (nA!=null && nB !=null){
            if (nA.val != nB.val){
                return false;
            }
            nA = nA.next;
            nB = nB.next;
        }
        if (nA != null || nB != null){
            return false;
        }
        return res;
    }
    public void printNode(ListNode first){
        ListNode node = first;
        System.out.print("printing nodes: ");
        while (node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
}