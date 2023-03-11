package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        // this method counts opening and closing brackets to ensure there are
        // the same amount of each (balanced brackets)
        int brackets = 0; // set brackets counter to 0
        for (char ch : str.toCharArray()) { // for each character in character array
            if (ch == '[') { // if character is opening bracket
                brackets++; // add it to counter
            } else if (ch == ']') { // else if character is closing bracket
                brackets--; // subtract from the counter
            } // the method fails test #9 on reversed brackets
            if (brackets < 0) { // if the counter is negative (more "]" than "[")
                return false; // then return false and stop the loop
            }
        }
        return brackets == 0; // returns t/f whether there are the same number of brackets
    }
}
