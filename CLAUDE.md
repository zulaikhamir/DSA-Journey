# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

A personal Java DSA (data structures & algorithms) practice collection, organized by topic and difficulty. Each solution is a standalone `.java` file in the default package (no `package` declarations) with its own `public class` and `main(String[] args)`.

## Commands

There is no root build system for the main codebase — solutions are run individually.

- Windows CMD: `run-java.cmd path\to\File.java`
- Windows PowerShell: `./run-java.ps1 path/to/File.java`
- Manual (any shell):
  ```
  javac path/to/File.java
  cd path/to && java ClassName
  ```

Both run scripts compile and execute in the file's own directory (so default-package classes resolve), then restore the original working directory.

### Tests (secondary, partial module)

`dsa-with-tests/dsa-tests/` is a separate Maven module (JUnit Jupiter 5.10.0) that mirrors a subset of solutions under `com.dsa` (`src/main/java/com/dsa/*.java` + matching `src/test/java/com/dsa/*Test.java`). It only covers early topics (arrays, some strings/patterns); many mirrored files are empty stubs. The main repository does not depend on this module or on Maven generally.

```
cd dsa-with-tests/dsa-tests
mvn test                                    # run all tests in the module
mvn -Dtest=ArraySumTest test                # run a single test class
```

The `pom.xml` at the repo root (artifactId `bit-manipulation`) is not wired to any `src/` tree at the root — ignore it unless asked to restructure the build.

## Repository structure

Problems are organized `<topic>/<difficulty>/File.java`:

```
basic/    legacy bucket, gradually being redistributed
easy/     warm-up, straightforward loops, basic DS ops
medium/   two-pointers, sliding window, hashing tricks, binary search variants
hard/     non-trivial invariants, optimizations, or multi-step reductions
```

Topics: `arrays/`, `strings/`, `math/`, `bit-manipulation/`, `matrix/`, `linked-list/`, `queue/`, `stack/`, `deque/`, `hashing/`, `patterns/`, `searching/`, `sorting/`, `recursion/`, `sliding-window/`, `trees/`.

`LEARNING_PATH.md` defines the intended study order across 6 phases (Foundations → Core Data Structures → Core Algorithms → Advanced Techniques → Specialized Topics → Mastery / DP); consult it when deciding where a new solution belongs or what topic logically comes next. Per-topic `README.md` files (e.g. `strings/README.md`) sometimes give a finer-grained recommended order and complexity notes within that topic.

## Conventions

- Filenames are PascalCase and match the public class name exactly (Java requires this).
- No `package` declarations — every file lives in the default package and is compiled/run standalone from its own directory.
- Problem names are descriptive: `SearchInRotatedSortedArray`, `TwoStacksInArray`, `SieveOfEratosthenes`.
- When multiple solutions exist for the same problem at increasing efficiency, name variants explicitly rather than overwriting, e.g. `SecondLargestInArray.java` (naive) vs `SecondLargestEfficient.java`; `CountDistinctNaive.java` vs `CountDistinctEfficient.java`.
- Place new solutions under the correct `<topic>/<difficulty>/` directory per the rubric above; keep code simple and idiomatic for learning purposes over compact/clever.
