package easy;

/**
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class DeleteMiddleNodeLCCI {

    public void deleteNode(ListNode node) {
        node.next = node.next.next;
        node.val = node.next.val;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
