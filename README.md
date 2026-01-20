# 🧠 DSA Journey — Zulaikha Ashiq

A collection of my solutions and notes while practicing data structures and algorithms.

## 🌿 Overview

Languages used: Java
Currently focusing on: Arrays, Strings, and Dynamic Programming
Goal: 200+ solved problems by mid-2026

## 🗺️ Learning Path

**New to DSA?** Check out [`LEARNING_PATH.md`](LEARNING_PATH.md) for a recommended order to tackle topics, building from foundations to advanced concepts.

The path is organized in 6 phases:

1. **Foundations** - Patterns, Math basics, Arrays basics
2. **Core Data Structures** - Strings, Linked Lists, Stack, Queue, Deque
3. **Core Algorithms** - Sorting, Searching, Recursion
4. **Advanced Techniques** - Hashing, Bit Manipulation, Optimization
5. **Specialized Topics** - Matrix, Advanced Math, Complex DS problems
6. **Mastery** - Dynamic Programming, Cross-topic problems

## 📁 Repository structure

All problems are organized by topic, then by difficulty. Filenames match public class names for easy running.

```
<topic>/
  basic/                # legacy bucket, gradually being redistributed
  easy/                 # warm-up, straightforward loops, basic DS ops
  medium/               # two-pointers, sliding window, hashing tricks, binary search variants
  hard/                 # non-trivial invariants, optimizations, or multi-step reductions

arrays/, strings/, math/, bit-manipulation/, matrix/, linked-list/,
queue/, stack/, deque/, hashing/, patterns/, searching/, sorting/, recursion/, dp/
```

Examples:

- `arrays/easy/ReverseArray.java`
- `strings/medium/LongestSubstringDistinctCharsEfficient.java`
- `searching/hard/MedianOfTwoSortedArrays.java`

## 🏆 Progress Tracker

| Platform | Solved | Profile Link                                           |
| -------- | ------ | ------------------------------------------------------ |
| LeetCode | 26     | [LeetCode Profile](https://leetcode.com/u/user1912Et/) |

## ▶️ How to run

- Windows (CMD):
  - `run-java.cmd path\\to\\File.java`
- Windows (PowerShell):
  - `./run-java.ps1 path/to/File.java`
- Manual (any shell):
  - `javac path/to/File.java`
  - `cd path/to && java ClassName`

Notes:

- Each file is standalone with its own `main(String[] args)` and no packages.
- The scripts compile and run in the file's directory so default-package classes work.

## 🔖 Naming conventions

- Filenames are PascalCase and match the public class name (Java requirement).
- Problem names are descriptive, e.g. `SearchInRotatedSortedArray`, `TwoStacksInArray`, `SieveOfEratosthenes`.

## 🎯 Difficulty rubric (relative)

- Easy
  - Straightforward iterations, simple math/conditions
  - Basic DS operations (insert/delete/traverse)
- Medium
  - Sliding window, two-pointers, hash-based techniques
  - Binary search variations, matrix traversals, efficient duplicates handling
- Hard
  - Non-trivial invariants or data structures; multi-phase logic
  - Problems where correctness depends on careful edge-case reasoning or optimal asymptotics

This rubric is applied by comparing solutions in the repo (not platform tags).

add JUnit tests in your local/GitHub repository
