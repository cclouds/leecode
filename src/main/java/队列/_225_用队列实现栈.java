package 队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description: 用队列实现栈
 * <p>
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * <p>
 * 使用队列实现栈的下列操作：
 * <p>
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 * <p>
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/7 9:59
 */
public class _225_用队列实现栈 {

    Queue<Integer> q1;
    Queue<Integer> q2;

    /**
     * Initialize your data structure here.
     */
    public _225_用队列实现栈() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q1.offer(x);

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int a = q1.poll();
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
        return a;
    }

    /**
     * Get the top element.
     */
    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        return q1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

}
