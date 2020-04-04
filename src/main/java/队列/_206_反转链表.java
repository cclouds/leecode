package 队列;

/**
 * Description: 206. 反转链表
 *  https://leetcode-cn.com/problems/reverse-linked-list/
 *
 *  反转一个单链表。
 *
 *  示例:
 *
 *  输入: 1->2->3->4->5->NULL
 *  输出: 5->4->3->2->1->NULL
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/3 16:09
 */
public class _206_反转链表 {
//    //迭代
//    public ListNode reverseList(ListNode head) {
//        if(head==null || head.next == null) {
//            return head;
//
//        }
//        ListNode newHead = null;
//
//        while(null != head){
//                ListNode tmp = head.next;
//                head.next = newHead;
//                newHead = head;
//                head = tmp;
//        }
//
//        return newHead;
//    }


    //递归
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

}
