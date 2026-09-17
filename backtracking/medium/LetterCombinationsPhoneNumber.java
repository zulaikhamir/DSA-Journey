// LeetCode 17 - Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Given a string of digits 2-9, return all possible letter combinations the number could represent
// (like an old T9 phone keypad).
// Approach: backtracking, one digit at a time, appending each possible letter for that digit.
// Time: O(4^n) worst case (digits 7 and 9 map to 4 letters), Space: O(n) recursion depth

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber {

    static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String digits = "23";
        System.out.println("Letter combinations for \"" + digits + "\": " + letterCombinations(digits));
    }

    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    static void backtrack(String digits, int idx, StringBuilder curr, List<String> result) {
        if (idx == digits.length()) {
            result.add(curr.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(idx) - '0'];

        for (char letter : letters.toCharArray()) {
            curr.append(letter);
            backtrack(digits, idx + 1, curr, result);
            curr.deleteCharAt(curr.length() - 1); // undo
        }
    }
}
