package GoalParserInterpretation;

import java.util.HashMap;

/**
 *
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 *
 * */
public class Solution {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {


        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");

    }
}
