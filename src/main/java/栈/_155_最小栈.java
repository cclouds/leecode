package 栈;

import java.util.Stack;

/**
 * Description: 最小栈
 *
 *  https://leetcode-cn.com/problems/min-stack/
 *
 *  设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/7 18:24
 */
public class _155_最小栈 {

    private Stack<Integer> stack;
    //帮助栈
    private Stack<Integer> helpStack;

    /** initialize your data structure here. */
    public _155_最小栈() {
        stack = new Stack<Integer>();
        helpStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(helpStack.isEmpty() || helpStack.peek()>x){
            helpStack.push(x);
        } else{
            helpStack.push(helpStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        helpStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helpStack.peek();
    }


    public static void main(String[] args) {
        _155_最小栈 minStack = new _155_最小栈();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();

    }
}
