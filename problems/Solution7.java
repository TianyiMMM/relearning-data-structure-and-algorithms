/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root != null){
            Queue<TreeNode> q = new LinkedList();
            Queue<Integer> p = new LinkedList();
            q.add(root);
            p.add(root.val);
            TreeNode delineater = null;
            q.add(delineater);
            p.add(-100);
            List<List<Integer>> res = new LinkedList();
            List<Integer> layer = new LinkedList();
            boolean right = true;

            while (!q.isEmpty()){
                TreeNode node = q.remove();
                int n = p.remove();
                System.out.println("q: "+Arrays.toString(p.toArray()));
                if (node != null){
                    System.out.println("node: "+node.val);
                    if (right){
                        if (node.right != null){
                            layer.addLast(node.val);
                        }
                    } else {
                        if (node.right != null){
                            layer.addFirst(node.val);
                        }  
                    }
                    if (node.left != null){
                        q.add(node.left);
                        p.add(node.left.val);
                    }
                    if (node.right != null){
                        q.add(node.right);
                        p.add(node.right.val);
                    }
                } else {
                    if (layer.size()!=0){
                        res.add(layer);
                        layer = new LinkedList();
                    }
                    if (!q.isEmpty()){
                        q.add(delineater);
                        p.add(-100);
                        right = !right;
                    }
                }
                System.out.println("layer: "+Arrays.toString(layer.toArray()));
                System.out.println("q: "+Arrays.toString(p.toArray()));
                System.out.println();
            }
            return res;
        } else {
            return new LinkedList();
        }
    }
}