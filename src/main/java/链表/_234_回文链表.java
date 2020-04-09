package 链表;

/**
 * Description: 回文链表
 * <p>
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/9 9:19
 */
public class _234_回文链表 {
    public boolean isPalindrome(ListNode head) {
        ListNode p = new ListNode(-1);
        p.next = head;
        ListNode slow = p;
        ListNode fast = p;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;

        ListNode pre = null;

        // 反转链表
        while (null != cur) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        // 比较
        ListNode newHead = p.next;
        while (pre != null) {
            if (pre.val != newHead.val) {
                return false;
            }
            pre = pre.next;
            newHead = newHead.next;
        }

        return true;

    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        _234_回文链表 test = new _234_回文链表();
        System.err.println(test.isPalindrome(head));

    }
}
