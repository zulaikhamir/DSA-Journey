# AGENTS.md

## Purpose

This repository is a Java practice collection for data structures and algorithms. It is organized by topic and difficulty, with each solution implemented as a standalone Java class in the default package.

## What agents should know

- Language: Java only.
- Each file is standalone with a `public class` and `main(String[] args)`.
- Filenames match the public class name exactly.
- Files are grouped by topic and difficulty under directories such as `arrays/`, `strings/`, `sorting/`, `dp/`, etc.
- There is no root build system for the main codebase; use the provided Windows scripts or direct `javac`/`java`.

## Run workflow

- Windows CMD: `run-java.cmd path\to\File.java`
- Windows PowerShell: `./run-java.ps1 path/to/File.java`
- Manual compile/run:
  - `javac path/to/File.java`
  - `cd path/to && java ClassName`

## Project conventions

- Keep implementations simple and idiomatic for practice code.
- Use PascalCase filenames and class names.
- Place new solutions under the correct topic and difficulty directory.
- Do not add package declarations unless the task explicitly requires package-based structure.
- Prefer clarity over overly compact code for learning-focused examples.

## Testing

- There is a Maven test module at `dsa-with-tests/dsa-tests/` using JUnit Jupiter.
- Agents may reference this module for test-driven work, but the main repository does not rely on Maven.

## Useful links

- [README.md](README.md)
- [LEARNING_PATH.md](LEARNING_PATH.md)
