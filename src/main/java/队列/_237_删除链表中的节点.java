package 队列;

/**
 * Description: 237. 删除链表中的节点
 *  https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 *  请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 *  输入: head = [4,5,1,9], node = 5
 *  输出: [4,1,9]
 *  解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 *
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/3 15:55
 */
public class _237_删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}