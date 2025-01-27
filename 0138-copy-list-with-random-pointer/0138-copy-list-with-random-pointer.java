/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newHead = new Node(0);
        Node node = head;
        Node newNode = newHead;
        Map<Node, Node> map = new HashMap<>();
        while (node != null) {
            newNode.next = new Node(node.val);
            map.put(node, newNode.next);
            newNode = newNode.next;
            node = node.next;
        }
        newNode = newHead.next;
        node = head;
        while (node != null) {
            newNode.random = map.get(node.random);
            newNode = newNode.next;
            node = node.next;
        }
        return newHead.next;
    }
}