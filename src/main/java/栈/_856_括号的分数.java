package 栈;

import java.util.Stack;

/**
 * Description: 括号的分数
 * <p>
 * https://leetcode-cn.com/problems/score-of-parentheses/
 * <p>
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * <p>
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入： "()"
 * 输出： 1
 * 示例 2：
 * <p>
 * 输入： "(())"
 * 输出： 2
 * 示例 3：
 * <p>
 * 输入： "()()"
 * 输出： 2
 * 示例 4：
 * <p>
 * 输入： "(()(()))"
 * 输出： 6
 *  
 * <p>
 * 提示：
 * <p>
 * S 是平衡括号字符串，且只含有 ( 和 ) 。
 * 2 <= S.length <= 50
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/6 18:25
 */
public class _856_括号的分数 {

    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        stack.push(0);
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if ('(' == c) {
                stack.push(0);
            } else {
                int second = stack.pop();
                int first = stack.pop();
                if ('(' == S.charAt(i - 1)) {
                    stack.push(first + 1);
                } else {
                    stack.push(first + (second << 1));
                }
            }

        }


        return stack.pop();

    }

    public static void main(String[] args) {
        _856_括号的分数 a = new _856_括号的分数();
        System.err.println(a.scoreOfParentheses("()"));
        System.err.println(a.scoreOfParentheses("(())"));
        System.err.println(a.scoreOfParentheses("(()(()))"));
        System.err.println(a.scoreOfParentheses("(()()())"));
        System.err.println(a.scoreOfParentheses("()(())"));

    }


}
