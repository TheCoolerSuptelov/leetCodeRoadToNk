package ValidBraces;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid(")(}{]["));
    }
    public static boolean isValid(String braces) {

        var hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');
        var stack = new Stack<Character>();
        var arrBraces = braces.toCharArray();
        for (int i = 0; i < arrBraces.length; i++) {
            if (hm.containsKey(arrBraces[i])){
                stack.push(arrBraces[i]);
                continue;
            }
            if (stack.isEmpty()) return  false;
            if (!hm.get(stack.pop()).equals(arrBraces[i])) return false;
        }

        if (!stack.isEmpty()) return false;

        return true;
    }

}
