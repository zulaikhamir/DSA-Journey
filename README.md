# 🧠 DSA Journey — Zulaikha Ashiq

A collection of my solutions and notes while practicing data structures and algorithms in Java.

## 🗺️ Progress

See [`LEARNING_PATH.md`](LEARNING_PATH.md) for the full phase breakdown and current status.

**Done:** Patterns, Math, Arrays, Strings, Linked List, Stack, Queue, Deque, Sorting, Searching, Recursion, Hashing, Bit Manipulation, Matrix.
**In progress:** Trees (`trees/basic/BinaryTreeTraversal`, `trees/easy/BSTSearch` exist — rest of the topic still to do).
**Not started:** Dynamic Programming.

## 📁 Repository structure

`<topic>/<difficulty>/File.java` — filenames match public class names for easy running.

```
basic/    legacy bucket, gradually being redistributed
easy/     warm-up, straightforward loops, basic DS ops
medium/   two-pointers, sliding window, hashing tricks, binary search variants
hard/     non-trivial invariants, optimizations, or multi-step reductions

Topics: patterns/, math/, arrays/, strings/, linked-list/, stack/, queue/,
deque/, sorting/, searching/, recursion/, hashing/, bit-manipulation/,
matrix/, trees/, dp/ (not started)
```

## 🏆 Progress Tracker

| Platform | Solved | Profile Link                                            |
| -------- | ------ | -------------------------------------------------------- |
| LeetCode | 26     | [LeetCode Profile](https://leetcode.com/u/user1912Et/)    |

## ▶️ How to run

- Windows (CMD): `run-java.cmd path\to\File.java`
- Windows (PowerShell): `./run-java.ps1 path/to/File.java`
- Manual: `javac path/to/File.java && cd path/to && java ClassName`

Each file is standalone with its own `main(String[] args)`, no packages. The scripts compile/run in the file's own directory so default-package classes resolve.

## 🔖 Conventions

- Filenames are PascalCase and match the public class name.
- Multiple solutions for one problem get distinct names by efficiency, e.g. `CountDistinctNaive.java` vs `CountDistinctEfficient.java`.
