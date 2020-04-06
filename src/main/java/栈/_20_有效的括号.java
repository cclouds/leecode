package 栈;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Description: 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 *
 * @author <a href="mailto:laozao@2dfire.com">laozao</a>
 * @since 2020/4/6 17:55
 */
public class _20_有效的括号 {
    private static Map<Character,Character> map = new HashMap();
    static{
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(!map.get(stack.pop()).equals(c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();


    }
}
