/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root!= null){
            Queue<Node> q = new LinkedList();
            Queue<Integer> p = new LinkedList();
            q.add(root);
            q.add(null);
            Node prev = root;
            Node record = prev;

            while (!q.isEmpty()){
                Node node = q.remove();
                if (node!=root){
                    if (node!=null){
                        prev.next = node;
                        prev = node;
                    } else if (!q.isEmpty()){
                        prev = q.remove();
                        record = prev;
                        q.add(null);
                        if (prev!=null && prev.left != null && prev.right != null){
                            q.add(prev.left);
                            q.add(prev.right);
                        }
                    }
                }
                if (node!=null && node.left != null && node.right != null){
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return root;
    }
    
    public void printLink(Node root){
        Node node = root;
        while (node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root!= null){
            Queue<Node> q = new LinkedList();
            Queue<Integer> p = new LinkedList();
            q.add(root);
            q.add(null);
            Node prev = root;
            Node record = prev;

            while (!q.isEmpty()){
                Node node = q.remove();
                if (node!=root){
                    if (node!=null){
                        prev.next = node;
                        prev = node;
                    } else if (!q.isEmpty()){
                        prev = q.remove();
                        record = prev;
                        q.add(null);
                        if (prev!=null && prev.left != null && prev.right != null){
                            q.add(prev.left);
                            q.add(prev.right);
                        }
                    }
                }
                if (node!=null && node.left != null && node.right != null){
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}