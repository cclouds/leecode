package 链表;

/**
 * Description:移除链表元素
 * <p>
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * <p>
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/4 19:23
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        //哨兵模式
        ListNode sentinelNode = new ListNode(-1);
        sentinelNode.next = head;
        ListNode node = sentinelNode;

        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return sentinelNode.next;


    }
}
