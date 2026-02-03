# Strings – Problems by Complexity

Problems are grouped into **basic**, **easy**, and **medium**, and ordered from simpler to more complex within each group.

---

## basic (demos & simple O(n))

| Order | File | Time | Description |
|-------|------|------|-------------|
| 1 | `StringFunctionsDemo.java` | — | API demo: length, charAt, substring |
| 2 | `StringCompare.java` | — | Reference vs value: `==` vs `equals` |
| 3 | `CompareStrings.java` | — | Demo: compareTo, indexOf |
| 4 | `SubsequenceCheck.java` | O(m+n) | Check if one string is subsequence of another |
| 5 | `PalindromeCheck.java` | O(n) | Palindrome check (recursive) |
| 6 | `PalindromeString.java` | O(n) | Palindrome check (iterative) |
| 7 | `CharacterFrequencies.java` | O(n) | Count frequency of each character |
| 8 | `RotationOfString.java` | O(n) | Check if one string is rotation of another (s+s trick) |
| 9 | `ReverseString.java` | O(n) | Reverse words in a sentence |

---

## easy (naive O(n²), O(n log n), or O(n) with extra space)

| Order | File | Time | Description |
|-------|------|------|-------------|
| 1 | `AreAnagrams.java` | O(n log n) | Check anagrams via sorting |
| 2 | `LeftmostRepeatingCharacter.java` | O(n²) | Leftmost repeating char (naive) |
| 3 | `LeftmostNonRepeatingChar.java` | O(n²) | Leftmost non-repeating char (naive) |
| 4 | `LeftmostRepeatingCharBetter.java` | O(n) | Leftmost repeating char (count array) |
| 5 | `LeftmostRepeatingCharEfficient1.java` | O(n) | Leftmost repeating char (first-index array) |
| 6 | `LeftmostRepeatingCharEfficient2.java` | O(n) | Leftmost repeating char (right-to-left visited) |
| 7 | `LeftmostNonRepeatingCharBetter.java` | O(n) | Leftmost non-repeating char (count array) |
| 8 | `LeftmostNonRepeatingCharEfficient.java` | O(n) | Leftmost non-repeating char (first-index array) |
| 9 | `PatternSearching.java` | O(m·n) | Naive pattern search in text |
| 10 | `DistinctPatternBrute.java` | O(m·n) | Naive pattern search (general) |
| 11 | `DistinctInPattern.java` | O(m) avg | Pattern search when pattern has distinct chars |
| 12 | `LongestSubstringDistinctCharsNaive.java` | O(n³) | Longest substring with distinct chars (naive) |
| 13 | `LongestSubstringDistinctCharsNaive2.java` | O(n³) | Same, distinct check with boolean array |
| 14 | `LongestSubstringDistinctCharsBetter.java` | O(n²) | Longest distinct substring (two loops + visited) |

---

## medium (efficient or conceptually harder)

| Order | File | Time | Description |
|-------|------|------|-------------|
| 1 | `LongestSubstringDistinctCharsEfficient.java` | O(n) | Sliding window for longest distinct substring |
| 2 | `LexicographicRank.java` | O(n) | Lexicographic rank of a string (factorial + count) |

---

## Summary

- **basic**: No real “algorithm” or single-pass / trivial O(n).
- **easy**: Naive solutions (double loops, sort) or O(n) with count/index arrays; pattern matching; longest distinct substring up to O(n²).
- **medium**: O(n) sliding window and rank-style problems.

Study in folder order (basic → easy → medium), and within each folder follow the table order for a smooth complexity progression.
