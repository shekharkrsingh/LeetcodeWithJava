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
        if (root == null)
            return root;
        Node node = root;
        Queue<Node> q = new LinkedList<>();
        q.offer(null);
        q.offer(root);
        while (q.size() != 1) {
            Node element = q.poll();
            if (element == null) {
                q.offer(null);
                continue;
            }
            element.next = q.peek();
            if (element.left != null)
                q.offer(element.left);
            if (element.right != null)
                q.offer(element.right);
        }
        return root;
    }
}