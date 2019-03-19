package LeetCode.Simple;

import java.util.Stack;

/**
 * @Author: liliang
 * @Date: 2019/3/19 14:45
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class LeetCode20 {
    public static void main(String[] args) {
//        String s ="({[})]({]}";
        String s ="({[]})";
        boolean solution = Solution(s);
        System.out.println(solution);
    }

    public static boolean Solution(String s){
        Stack<Character> stack = new Stack();
        for (int i =0;i<s.length();i++){
            char a = s.charAt(i);
            if (a=='(' || a=='[' || a=='{'){
                stack.push(a);
            }else{
                if (stack.empty()){
                    return false;
                }
                char c = stack.pop();
                if (a ==')' && c !='(')  return false;
                if (a ==']' && c !='[')  return false;
                if (a =='}' && c !='{')  return false;
            }

        }

        return stack.empty();
    }
}
