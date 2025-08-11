import java.util.*;
public class DecodeString {
     public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();         // Stores repeat counts
        Stack<StringBuilder> stringStack = new Stack<>();  // Stores strings before '['
        StringBuilder currentString = new StringBuilder(); // Current working string
        int num = 0; // Current number being built

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Get current character

            if (Character.isDigit(ch)) {
                // Build the number (could be more than 1 digit)
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                // Push the current number and string into stacks
                countStack.push(num);
                stringStack.push(currentString);
                // Reset for the new bracket
                currentString = new StringBuilder();
                num = 0;
            }
            else if (ch == ']') {
                // Pop repeat count and previous string
                int count = countStack.pop();
                StringBuilder prevString = stringStack.pop();
                // Append currentString 'count' times
                for (int j = 0; j < count; j++) {
                    prevString.append(currentString);
                }
                // Set currentString to the combined one
                currentString = prevString;
            }
            else {
                // Append letters directly
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString sol = new DecodeString();
        System.out.println(sol.decodeString("3[a]2[bc]"));       // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]"));        // accaccacc
        System.out.println(sol.decodeString("2[abc]3[cd]ef"));   // abcabccdcdcdef
    }

}
