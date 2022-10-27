
import java.util.*;

        
static boolean isProperly(String sequence) {
        
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < sequence.length(); i++){
        char ch = sequence.charAt(i);
        if (ch == '(') {
            stack.push(ch);
            continue;
        }
        
        if (stack.isEmpty()) {
            return false;
        }

        char stackTop = stack.pop();
        
    }

    return stack.isEmpty();
}
