package 链表;

/**
 * Description: 删除排序链表中的重复元素
 * <p>
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/5 17:38
 */
public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newhead = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return newhead;


    }
}
