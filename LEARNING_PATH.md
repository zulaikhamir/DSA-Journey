# 🎯 Recommended Learning Path - DSA Journey

A strategic order to tackle topics, building from foundations to advanced concepts.

## ✅ Current status (based on git history)

- **Phases 1–4 complete**: Patterns, Math, Arrays, Strings, Linked List, Stack, Queue,
  Deque, Sorting (incl. heap/counting/radix/bucket/cycle sort), Searching, Recursion,
  Hashing, Bit Manipulation.
- **Phase 5.1–5.3 complete**: Matrix, advanced Math (Sieve, prime factors, Josephus),
  advanced Stack/Queue/Deque/Linked List.
- **Phase 5.4 Trees — in progress, pick up here next**: only
  `trees/basic/BinaryTreeTraversal.java` and `trees/easy/BSTSearch.java` exist so far.
  Next up: `HeightOfTree`, `SizeOfTree` (easy) → `LevelOrderTraversal`, `LeftView`,
  `BinaryTreeToDLL` (medium) → `SerializeDeserialize`, iterative traversals (hard).
- **Phase 6 DP — not started**: no `dp/` directory yet.

## 🎯 Interview Prep Track (100-day plan, SDE1/backend Java @ ₹12 LPA+)

Current LeetCode split is 73% Easy — from here, the focus shifts to Medium-difficulty
coverage across all major interview patterns, not raw problem count. **Pace target: 8
Medium problems/week.** New folders below are sequenced by tier (Tier 1 = highest
interview frequency, do first).

### Audit of existing folders (Medium-difficulty coverage)

| Folder | Medium coverage | Flag |
| --- | --- | --- |
| `sorting/`, `hashing/`, `searching/`, `bit-manipulation/`, `matrix/` | Strong, all major sub-patterns present | OK |
| `queue/`, `deque/`, `stack/` | Decent for topic scope | OK |
| `arrays/medium/` | Only 2 files (RemoveDuplicates, SecondLargestEfficient) | **Thin** — missing prefix-sum/array-rearrangement mediums |
| `linked-list/medium/` | Only 4 files, but `linked-list/hard/` picks up most classic mediums (cycle detection, merge, LRU) | Borderline OK |
| `strings/medium/` | Only 1 file (LexicographicRank) | **Very thin** for a Tier-1-heavy topic |
| `math/` | No `medium/`/`hard/` folder at all — Sieve/PrimeFactors live under `easy/`, mislabeled | **Thin / mislabeled** |
| `sliding-window/` | Flat (no difficulty subfolders), only 5 files | **Thin**, inconsistent structure vs. rest of repo |
| `trees/` | Only 2 files total (`BinaryTreeTraversal`, `BSTSearch`) | **Very thin** — missing Validate BST, LCA, Kth Smallest in BST, Level Order, Diameter, Serialize/Deserialize entirely |
| `recursion/` | No `easy/` folder; decent basic+medium split | OK given backtracking is now split out separately |
| `patterns/` | Easy-only | N/A — warm-up topic, Medium doesn't apply |

None of the above were touched automatically — flagged here for a deliberate pass rather
than silently added to.

### New pattern folders (added, Tier-ordered)

1. **`two-pointers/`** (Tier 1) — split out of arrays/searching for clarity: ContainerWithMostWater, ThreeSum, TrappingRainWater
2. **`graphs/`** (Tier 1) — BFS/DFS, Union-Find, topological sort: NumberOfIslands, CloneGraph, RottingOranges, NumberOfConnectedComponents, CourseSchedule(+II), RedundantConnection, GraphValidTree, plus stretch NetworkDelayTime (Dijkstra) and PacificAtlanticWaterFlow
3. **`dynamic-programming/`** (Tier 1) — 1D DP, classic patterns, 2D DP: ClimbingStairs, HouseRobber(+II), MaximumSubarrayKadane, DecodeWays, CoinChange, LongestIncreasingSubsequence, WordBreak, UniquePaths, LongestCommonSubsequence, EditDistance, ZeroOneKnapsack, PartitionEqualSubsetSum
4. **`backtracking/`** (Tier 2) — Subsets(+II), Permutations, CombinationSum, WordSearch, PalindromePartitioning, LetterCombinationsPhoneNumber, plus stretch NQueens
5. **`heap-priority-queue/`** (Tier 2) — KthLargestElement, TopKFrequentElements, TaskScheduler, plus stretch FindMedianFromDataStream and MergeKSortedLists
6. **`intervals/`** (Tier 2) — MergeIntervals, InsertInterval, MeetingRoomsI(+II), NonOverlappingIntervals
7. **`greedy/`** (Tier 2) — JumpGame(+II), GasStation
8. **`design/`** (Tier 3) — MinStack, ImplementQueueUsingStacks, plus stretch LFUCache (LRUCache already existed at `linked-list/hard/LRUCacheDesign.java`)
9. **`trie/`** (Tier 3, lowest priority) — ImplementTrie, WordSearchII

All follow the existing `<topic>/<difficulty>/File.java` convention (standalone, default
package, `public class` + `main`), verified to compile and run correctly.

---

## 📚 Phase 1: Foundations (Weeks 1-2)
**Goal**: Build core programming skills and problem-solving mindset

### 1.1 Patterns (Easy)
- **Why first**: Develops loop thinking and pattern recognition
- **Files**: All files in `patterns/easy/`
- **Skills**: Nested loops, control flow, output formatting

### 1.2 Math Basics (Basic + Easy)
- **Why early**: Mathematical thinking underlies many algorithms
- **Order**:
  1. `math/basic/` - NumberPalindrome, LcmAndGcd
  2. `math/easy/` - CountDigits, SumOfDigits, Factorial, Fibonacci, GCD, LCM, PrimeCheck, PrintDivisors
- **Skills**: Number manipulation, basic algorithms

### 1.3 Arrays - Basics (Basic + Easy)
- **Why now**: Arrays are the most fundamental data structure
- **Order**:
  1. `arrays/basic/` - All files (FibonacciArray, SumOfEvenElements, etc.)
  2. `arrays/easy/` - Start with:
     - ArrayTraversal, ArraySum
     - FindElement, SearchInArray
     - LargestElement, SecondLargestInArray
     - ReverseArray
     - InsertElement, DeleteElement
     - CheckSortedArray
     - LeftRotateByOne, LeftRotateBy2
     - MoveAllZerosToEnd
- **Skills**: Array manipulation, indexing, basic algorithms

---

## 📚 Phase 2: Core Data Structures (Weeks 3-5)
**Goal**: Master fundamental linear data structures

### 2.1 Strings (Basic + Easy)
- **Why after arrays**: Strings are character arrays with special operations
- **Order**:
  1. `strings/basic/` - All files
  2. `strings/easy/` - Start with:
     - ReverseString, StringCompare, StringFunctionsDemo
     - PalindromeCheck, PalindromeString
     - AreAnagrams
     - PatternSearching
     - LeftmostRepeatingCharacter, LeftmostNonRepeatingChar
- **Skills**: String manipulation, character operations

### 2.2 Linked Lists (Easy)
- **Why now**: Introduces dynamic memory and pointers
- **Order**: All files in `linked-list/easy/`
  - LinkedListTraversal
  - InsertNode, DeleteNode
  - SearchLinkedList
  - ReverseLinkedList
  - DoublyLinkedListInsert, DeleteInDoublyLinkedList
  - SortedLinkedList
- **Skills**: Pointers, dynamic structures, memory management

### 2.3 Stack (Easy → Medium)
- **Why now**: LIFO structure, essential for many algorithms
- **Order**:
  1. `stack/easy/` - All files
  2. `stack/medium/` - BalancedParentheses, StockSpan, PreviousGreaterElement
- **Skills**: LIFO operations, stack-based algorithms

### 2.4 Queue (Basic + Easy → Medium)
- **Why after stack**: FIFO complements LIFO understanding
- **Order**:
  1. `queue/basic/` - All files
  2. `queue/easy/` - All files
  3. `queue/medium/` - Stack/Queue interconversions
- **Skills**: FIFO operations, queue implementations

### 2.5 Deque (Basic + Easy)
- **Why now**: Combines stack and queue concepts
- **Order**: All files in `deque/basic/` and `deque/easy/`
- **Skills**: Double-ended operations

---

## 📚 Phase 3: Core Algorithms (Weeks 6-8)
**Goal**: Master fundamental algorithmic techniques

### 3.1 Sorting (Easy)
- **Why now**: Essential algorithmic technique, needed for many problems
- **Order**: All files in `sorting/easy/`
  1. BubbleSort
  2. SelectionSort
  3. InsertionSort
- **Skills**: Comparison-based sorting, algorithm analysis

### 3.2 Searching (Basic + Easy → Medium → Hard)
- **Why after sorting**: Many search problems assume sorted data
- **Order**:
  1. `searching/basic/` - All files
  2. `searching/easy/` - Start with:
     - BinarySearch (critical!)
     - IndexOfFirstOccurrence, LastOccurrence
     - CountOccurrences, CountOnes
     - PeakElement
  3. `searching/medium/` - TwoPointerTechnique, SearchInRotatedSortedArray
  4. `searching/hard/` - Advanced problems
- **Skills**: Binary search, two-pointer technique

### 3.3 Recursion (Medium)
- **Why now**: Fundamental problem-solving paradigm
- **Order**: All files in `recursion/medium/`
  - TowerOfHanoi
  - Permutations
  - SubsequenceOrSubset
  - SubsetSum
  - RopeCutting
- **Skills**: Recursive thinking, base cases, backtracking

---

## 📚 Phase 4: Advanced Techniques (Weeks 9-11)
**Goal**: Learn optimization techniques and advanced patterns

### 4.1 Arrays - Advanced (Medium)
- **Why now**: Apply learned techniques to arrays
- **Order**: All files in `arrays/medium/`
  - RemoveDuplicates, RemoveDuplicatesEfficient
  - SecondLargestEfficient
- **Skills**: Optimization, efficient algorithms

### 4.2 Strings - Advanced (Medium)
- **Why now**: Apply advanced techniques to strings
- **Order**: All files in `strings/medium/`
  - LongestSubstringDistinctCharsEfficient
  - CharacterFrequencies
  - LexicographicRank
- **Skills**: Sliding window, string algorithms

### 4.3 Hashing (Basic + Easy → Medium)
- **Why now**: Powerful optimization technique
- **Order**:
  1. `hashing/basic/` - All files
  2. `hashing/easy/` - Start with:
     - HashMapExample, HashSetExample
     - FrequencyWithHashMap
     - PairWithSumNaive
  3. `hashing/medium/` - Efficient solutions
     - PairWithSumEfficient
     - SubarrayZeroSumEfficient
     - LongestSubarraySumEfficient
     - LongestConsecutiveSubsequenceEfficient
- **Skills**: Hash-based optimization, O(1) lookups

### 4.4 Bit Manipulation (Basic + Easy → Medium)
- **Why now**: Low-level optimization technique
- **Order**:
  1. `bit-manipulation/basic/` - BitwiseOperatorsDemo
  2. `bit-manipulation/easy/` - All files
  3. `bit-manipulation/medium/` - All files
- **Skills**: Bitwise operations, optimization tricks

---

## 📚 Phase 5: Specialized Topics (Weeks 12-14)
**Goal**: Master domain-specific problem types

### 5.1 Matrix (Basic + Easy → Medium → Hard)
- **Why now**: 2D array problems require different thinking
- **Order**: All files by difficulty
- **Skills**: 2D traversal, matrix algorithms

### 5.2 Math - Advanced (Medium + Hard)
- **Why now**: Advanced mathematical algorithms
- **Order**:
  1. `math/medium/` - SieveOfEratosthenes, PrimeFactors
  2. `math/hard/` - JosephusProblem
- **Skills**: Number theory, advanced algorithms

### 5.3 Advanced Data Structures
- **Stack/Queue/Deque - Hard/Medium**:
  - `stack/hard/` - KStacksInArray
  - `deque/medium/` - FirstCircularTourEfficient, MinMaxDataStructure
  - `deque/hard/` - MaxInSubarraysEfficient
- **Linked List - Medium**: All files in `linked-list/medium/`

### 5.4 Trees (Basic → Easy → Medium → Hard)
- **Why now**: Fundamental non-linear data structure, bridge to Graphs and advanced DP.
- **Order**:
  1. `trees/basic/` - BinaryTreeTraversal (Inorder, Preorder, Postorder)
  2. `trees/easy/` - BSTSearch, HeightOfTree, SizeOfTree
  3. `trees/medium/` - LevelOrderTraversal, LeftView, BinaryTreeToDLL
  4. `trees/hard/` - SerializeDeserialize, TreeTraversals (Iterative)
- **Skills**: Hierarchical data, recursion on trees, BST properties

---

## 📚 Phase 6: Mastery (Weeks 15+)
**Goal**: Tackle complex, multi-concept problems

### 6.1 Dynamic Programming (Easy → Medium → Hard)
- **Why last**: Requires strong foundation in recursion and problem-solving
- **Order**: All files by difficulty in `dp/`
- **Skills**: Memoization, tabulation, state transitions

### 6.2 Cross-Topic Problems
- **Arrays - Hard**: Complex array problems
- **Strings - Hard**: Advanced string algorithms
- **Searching - Hard**: Complex search problems
- **All Hard problems**: Integrate multiple concepts

---

## 🎯 Quick Reference: Topic Dependencies

```
Patterns → Math → Arrays → Strings
                ↓
         Linked Lists → Stack → Queue → Deque
                ↓
         Sorting → Searching
                ↓
         Recursion → Trees → Dynamic Programming
                ↓
         Hashing, Bit Manipulation, Matrix, Graphs (can be parallel)
```

## 💡 Tips for Success

1. **Complete each phase before moving on**: Don't skip ahead
2. **Solve Easy → Medium → Hard within each topic**: Build confidence gradually
3. **Revisit previous topics**: Spaced repetition helps retention
4. **Focus on understanding, not speed**: Quality over quantity
5. **Practice daily**: Consistency beats intensity
6. **Track your progress**: Mark solved problems, note patterns

## 📊 Estimated Timeline

- **Phase 1**: 2 weeks (Foundations)
- **Phase 2**: 3 weeks (Core Data Structures)
- **Phase 3**: 3 weeks (Core Algorithms)
- **Phase 4**: 3 weeks (Advanced Techniques)
- **Phase 5**: 3 weeks (Specialized Topics)
- **Phase 6**: Ongoing (Mastery)

**Total**: ~14 weeks for solid foundation, then continuous practice

---

*This path is designed to build knowledge incrementally. Adjust pace based on your comfort level!*

