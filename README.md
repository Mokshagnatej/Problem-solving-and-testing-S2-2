# 🧠 Problem Solving and Testing (Java) — S2-2

<div align="center">

![Total Solved](https://img.shields.io/badge/Total_Problems-34_Solved-2ea44f?style=for-the-badge&logo=java&logoColor=white)
![Java](https://img.shields.io/badge/Language-Java_100%25-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Weeks Completed](https://img.shields.io/badge/Curriculum-Week_1_to_4-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

*A structured, production-grade repository documenting solutions, algorithmic patterns, and technical test cases across LeetCode, HackerRank, and GeeksforGeeks.*

</div>

---

## 📌 Table of Contents

- [Overview](#-overview)
- [Repository Analytics](#-repository-analytics)
- [Weekly Curriculum & Solutions](#-weekly-curriculum--solutions)
  - [Week 1: Core Java & Array Foundations](#-week-1-core-java--array-foundations)
  - [Week 2: Data Structures, Two Pointers & Hashing](#-week-2-data-structures-two-pointers--hashing)
  - [Week 3: Collections Framework, Custom Comparators & Date/Time](#-week-3-collections-framework-custom-comparators--datetime)
  - [Week 4: 2D Matrices, String Manipulation & Advanced Simulations](#-week-4-2d-matrices-string-manipulation--advanced-simulations)
- [Key Algorithmic Patterns](#-key-algorithmic-patterns)
- [Repository Structure](#-repository-structure)
- [How to Navigate & Run](#-how-to-navigate--run)

---

## 📖 Overview

This repository contains curated problem solutions for the **Problem Solving and Testing (PSTJ / S2-2)** track. Every problem features clean, modular, and time/space-optimal **Java** code, accompanied by problem statements, constraints, and time/space complexity breakdowns.

### Platforms Covered
- 🟧 **LeetCode** (19 Problems)
- 🟩 **HackerRank** (14 Problems)
- 🟩 **GeeksforGeeks** (1 Problem)

---

## 📊 Repository Analytics

<div align="center">

| Metric | Details |
| :--- | :--- |
| **Total Problems Solved** | **34** |
| **Primary Language** | **Java (100%)** |
| **Difficulty Breakdown** | 🟢 **Easy:** 21 &nbsp;\|&nbsp; 🟡 **Medium:** 12 &nbsp;\|&nbsp; 🔴 **Hard:** 1 |
| **Weekly Progress** | **Week 1** (6) · **Week 2** (9) · **Week 3** (8) · **Week 4** (11) |

</div>

### Difficulty & Platform Distribution

| Platform | 🟢 Easy | 🟡 Medium | 🔴 Hard | Total |
| :--- | :---: | :---: | :---: | :---: |
| **LeetCode** | 12 | 7 | 0 | **19** |
| **HackerRank** | 8 | 5 | 1 | **14** |
| **GeeksforGeeks** | 1 | 0 | 0 | **1** |
| **Total** | **21** | **12** | **1** | **34** |

---

## 🚀 Weekly Curriculum & Solutions

### 🔹 [Week 1: Core Java & Array Foundations](./Week-1/README.md)
> *Focus: Core Java 8+ features (Lambda expressions, Functional Interfaces, Comparators) and foundational array manipulation (Prefix Sums, Two-Pointer technique).*

| Status | Problem | Platform | Difficulty | Core Concept | Solution |
| :---: | :--- | :---: | :---: | :--- | :---: |
| ✅ | **[Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)** | LeetCode | 🟢 Easy | Prefix Sum / Pivot Search | [Java](./Week-1/find-pivot-index/solution.java) |
| ✅ | **[Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)** | LeetCode | 🟢 Easy | 2D Arrays / Row Sum | [Java](./Week-1/richest-customer-wealth/solution.java) |
| ✅ | **[Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)** | LeetCode | 🟢 Easy | Two-Pointer Array Ordering | [Java](./Week-1/squares-of-a-sorted-array/solution.java) |
| ✅ | **[Java Sort](https://www.hackerrank.com/challenges/java-sort/problem)** | HackerRank | 🟢 Easy | Custom Object Sorting (`Collections.sort`) | [Java](./Week-1/java-sort/solution.java) |
| ✅ | **[Java Comparator](https://www.hackerrank.com/challenges/java-comparator/problem)** | HackerRank | 🟡 Medium | Custom `Comparator<Player>` Implementation | [Java](./Week-1/java-comparator/solution.java) |
| ✅ | **[Java Lambda Expressions](https://www.hackerrank.com/challenges/java-lambda-expressions/problem)** | HackerRank | 🟡 Medium | Functional Interfaces & Predicate Lambdas | [Java](./Week-1/java-lambda-expressions/solution.java) |

---

### 🔹 [Week 2: Data Structures, Two Pointers & Hashing](./Week-2/README.md)
> *Focus: In-place array operations, Kadane's dynamic programming algorithm, hash map grouping, sliding window deques, and priority queue heaps.*

| Status | Problem | Platform | Difficulty | Core Concept | Solution |
| :---: | :--- | :---: | :---: | :--- | :---: |
| ✅ | **[Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)** | LeetCode | 🟢 Easy | Prefix Sums / Net Gain Accumulation | [Java](./Week-2/find-the-highest-altitude/solution.java) |
| ✅ | **[Group Anagrams](https://leetcode.com/problems/group-anagrams/)** | LeetCode | 🟡 Medium | Hash Map / Character Frequency Keys | [Java](./Week-2/group-anagrams/solution.java) |
| ✅ | **[Java Dequeue](https://www.hackerrank.com/challenges/java-dequeue/problem)** | HackerRank | 🟡 Medium | Sliding Window with `ArrayDeque` & `HashSet` | [Java](./Week-2/java-dequeue/solution.java) |
| ✅ | **[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Algorithm ($O(N)$ Dynamic Programming) | [Java](./Week-2/maximum-subarray/solution.java) |
| ✅ | **[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers (In-place $O(1)$ Space) | [Java](./Week-2/remove-duplicates-from-sorted-array/solution.java) |
| ✅ | **[Remove Element](https://leetcode.com/problems/remove-element/)** | LeetCode | 🟢 Easy | Two Pointers (In-place Partitioning) | [Java](./Week-2/remove-element/solution.java) |
| ✅ | **[Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | Running Accumulation / Prefix Sum | [Java](./Week-2/running-sum-of-1d-array/solution.java) |
| ✅ | **[Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)** | LeetCode | 🟢 Easy | Array Interleaving / Index Mapping | [Java](./Week-2/shuffle-the-array/solution.java) |
| ✅ | **[Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)** | LeetCode | 🟡 Medium | `HashMap` + `PriorityQueue` (Min-Heap) | [Java](./Week-2/top-k-frequent-elements/solution.java) |

---

### 🔹 [Week 3: Collections Framework, Custom Comparators & Date/Time](./Week-3/README.md)
> *Focus: Modern Java Date/Time API (`java.time.LocalDate`, `ChronoUnit`), dynamic multidimensional lists (`ArrayList`), custom multi-attribute comparators, and event-driven Priority Queues.*

| Status | Problem | Platform | Difficulty | Core Concept | Solution |
| :---: | :--- | :---: | :---: | :--- | :---: |
| ✅ | **[Day of the Week](https://leetcode.com/problems/day-of-the-week/)** | LeetCode | 🟢 Easy | `java.time.LocalDate` / Calendar Arithmetic | [Java](./Week-3/day-of-the-week/solution.java) |
| ✅ | **[Day of the Year](https://leetcode.com/problems/day-of-the-year/)** | LeetCode | 🟢 Easy | Date Parsing & Leap Year Validation | [Java](./Week-3/day-of-the-year/solution.java) |
| ✅ | **[Number of Days Between Two Dates](https://leetcode.com/problems/number-of-days-between-two-dates/)** | LeetCode | 🟢 Easy | Date Distance Calculation (`ChronoUnit`) | [Java](./Week-3/number-of-days-between-two-dates/solution.java) |
| ✅ | **[Java ArrayList](https://www.hackerrank.com/challenges/java-arraylist/problem)** | HackerRank | 🟡 Medium | Dynamic 2D Lists & Safe Bounds Queries | [Java](./Week-3/java-arraylist/solution.java) |
| ✅ | **[Java Comparator](https://www.hackerrank.com/challenges/java-comparator/problem)** | HackerRank | 🟡 Medium | Multi-tiered Sorting with `Comparator` | [Java](./Week-3/java-comparator/solution.java) |
| ✅ | **[Java Date and Time](https://www.hackerrank.com/challenges/java-date-and-time/problem)** | HackerRank | 🟢 Easy | Day-of-Week Extraction via `Calendar`/`LocalDate` | [Java](./Week-3/java-date-and-time/solution.java) |
| ✅ | **[Java Priority Queue](https://www.hackerrank.com/challenges/java-priority-queue/problem)** | HackerRank | 🟡 Medium | Dynamic Event Simulation & `PriorityQueue` | [Java](./Week-3/java-priority-queue/solution.java) |
| ✅ | **[Java Sort](https://www.hackerrank.com/challenges/java-sort/problem)** | HackerRank | 🟡 Medium | Multi-property Object Ordering | [Java](./Week-3/java-sort/solution.java) |

---

### 🔹 [Week 4: 2D Matrices, String Manipulation & Advanced Simulations](./Week-4/README.md)
> *Focus: 2D Matrix transformations (Transposition, Multiplication, 2D Block Sums, Layer-by-Layer Rotation), String processing, Two Pointers, and Set hashing.*

| Status | Problem | Platform | Difficulty | Core Concept | Solution |
| :---: | :--- | :---: | :---: | :--- | :---: |
| ✅ | **[Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)** | LeetCode | 🟢 Easy | Hash Set / Map Lookup ($O(N)$) | [Java](./Week-4/0217-contains-duplicate/solution.java) |
| ✅ | **[Move Zeroes](https://leetcode.com/problems/move-zeroes/)** | LeetCode | 🟢 Easy | Two Pointers (In-place Element Partitioning) | [Java](./Week-4/0283-move-zeroes/solution.java) |
| ✅ | **[Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)** | LeetCode | 🟢 Easy | 2D Matrix Axis Swapping ($M \times N \to N \times M$) | [Java](./Week-4/0867-transpose-matrix/solution.java) |
| ✅ | **[Matrix Block Sum](https://leetcode.com/problems/matrix-block-sum/)** | LeetCode | 🟡 Medium | 2D Bounded Window Summation | [Java](./Week-4/1314-matrix-block-sum/solution.java) |
| ✅ | **[Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/)** | LeetCode | 🟢 Easy | String Splitting & Vowel Counting | [Java](./Week-4/1704-determine-if-string-halves-are-alike/solution.java) |
| ✅ | **[Compare the Triplets](https://www.hackerrank.com/challenges/compare-the-triplets/problem)** | HackerRank | 🟢 Easy | Element-wise Comparison & Accumulation | [Java](./Week-4/compare-the-triplets/solution.java) |
| ✅ | **[Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)** | HackerRank | 🟢 Easy | Primary & Secondary Diagonal Sums | [Java](./Week-4/diagonal-difference/solution.java) |
| ✅ | **[Matrix Layer Rotation](https://www.hackerrank.com/challenges/matrix-rotation-algo/problem)** | HackerRank | 🔴 Hard | Concentric Ring Extraction & Modulo Shift | [Java](./Week-4/matrix-rotation-algo/solution.java) |
| ✅ | **[Multiply 2 Matrices](https://www.geeksforgeeks.org/problems/multiply-matrices/1)** | GeeksforGeeks | 🟢 Easy | Matrix Multiplication ($O(N^3)$ Iteration) | [Java](./Week-4/multiply-2-matrices4144/solution.java) |
| ✅ | **[Time Conversion](https://www.hackerrank.com/challenges/time-conversion/problem)** | HackerRank | 🟢 Easy | 12-Hour to 24-Hour Military Format Parsing | [Java](./Week-4/time-conversion/solution.java) |
| ✅ | **[Two Strings](https://www.hackerrank.com/challenges/two-strings/problem)** | HackerRank | 🟢 Easy | Character Set Intersection ($O(A+B)$ Time) | [Java](./Week-4/two-strings/solution.java) |

---

## 💡 Key Algorithmic Patterns

```
                                  ┌─── Prefix Sums (1D & 2D Ranges)
                                  ├─── Two Pointers (In-place Swaps, Reversals)
           ┌─── Core Algorithms ──┼─── Kadane's Algorithm (Contiguous Subarray DP)
           │                      └─── Matrix Layer Rotation (Ring Extraction + Modulo Shift)
           │
Patterns ──┤
           │                      ┌─── Hash Maps & Sets (O(1) Lookup & Frequency Count)
           └─── Data Structures ──┼─── Heaps / PriorityQueue (Top-K, Event Scheduling)
                                  ├─── Deque (Sliding Window Extremas)
                                  └─── Custom Comparators & Lambdas (Flexible Sorting)
```

1. **Prefix Sum Technique:** Converts repeated range sum queries from $O(N)$ to $O(1)$ by precomputing running totals (applied in *Running Sum*, *Find Pivot Index*, *Find Highest Altitude*, *Matrix Block Sum*).
2. **Two-Pointer Paradigm:** Achieves optimal $O(N)$ runtime and $O(1)$ auxiliary space by scanning from boundaries or maintaining slow/fast pointer indices (*Move Zeroes*, *Remove Duplicates*, *Remove Element*, *Squares of a Sorted Array*).
3. **Hashing & Set Intersections:** Provides $O(1)$ expected lookup for anagram classification, duplicate detection, and substring matching (*Contains Duplicate*, *Group Anagrams*, *Two Strings*).
4. **Kadane's Dynamic Programming:** Finds the maximum subarray sum in a single pass ($O(N)$ time, $O(1)$ space) by deciding whether to extend the current sum or start anew (*Maximum Subarray*).
5. **Concentric Layer Matrix Manipulation:** Deconstructs 2D matrices into 1D continuous rings, applies cyclic shift with $(i + r) \pmod{\text{length}}$, and reconstructs back into 2D layout (*Matrix Layer Rotation*).
6. **Modern Java Time & Functional Utilities:** Leverages `java.time.LocalDate`, functional interfaces, and custom `Comparator<T>` implementations to handle complex ordering and calendar logic cleanly.

---

## 📂 Repository Structure

```
Problem-solving-and-testing-S2-2/
├── README.md                                  # Repository-wide documentation & index
├── Week-1/                                    # Week 1: Core Java & Array Foundations
│   ├── README.md
│   ├── find-pivot-index/                      # LeetCode 724
│   ├── java-comparator/                       # HackerRank
│   ├── java-lambda-expressions/               # HackerRank
│   ├── java-sort/                             # HackerRank
│   ├── richest-customer-wealth/               # LeetCode 1672
│   └── squares-of-a-sorted-array/             # LeetCode 977
├── Week-2/                                    # Week 2: Data Structures & Hashing
│   ├── README.md
│   ├── find-the-highest-altitude/             # LeetCode 1732
│   ├── group-anagrams/                        # LeetCode 49
│   ├── java-dequeue/                          # HackerRank
│   ├── maximum-subarray/                      # LeetCode 53
│   ├── remove-duplicates-from-sorted-array/   # LeetCode 26
│   ├── remove-element/                        # LeetCode 27
│   ├── running-sum-of-1d-array/               # LeetCode 1480
│   ├── shuffle-the-array/                     # LeetCode 1470
│   └── top-k-frequent-elements/               # LeetCode 347
├── Week-3/                                    # Week 3: Collections & Date/Time
│   ├── README.md
│   ├── day-of-the-week/                       # LeetCode 1185
│   ├── day-of-the-year/                       # LeetCode 1154
│   ├── java-arraylist/                        # HackerRank
│   ├── java-comparator/                       # HackerRank
│   ├── java-date-and-time/                    # HackerRank
│   ├── java-priority-queue/                   # HackerRank
│   ├── java-sort/                             # HackerRank
│   └── number-of-days-between-two-dates/      # LeetCode 1360
└── Week-4/                                    # Week 4: Matrices & Advanced Strings
    ├── README.md
    ├── 0217-contains-duplicate/               # LeetCode 217
    ├── 0283-move-zeroes/                      # LeetCode 283
    ├── 0867-transpose-matrix/                 # LeetCode 867
    ├── 1314-matrix-block-sum/                 # LeetCode 1314
    ├── 1704-determine-if-string-halves-alike/ # LeetCode 1704
    ├── compare-the-triplets/                  # HackerRank
    ├── diagonal-difference/                   # HackerRank
    ├── matrix-rotation-algo/                  # HackerRank (Hard)
    ├── multiply-2-matrices4144/               # GeeksforGeeks
    ├── time-conversion/                       # HackerRank
    └── two-strings/                           # HackerRank
```

---

## 💻 How to Navigate & Run

### Prerequisites
- **JDK:** Java 8+ (Java 17 or 21 recommended)
- **IDE:** IntelliJ IDEA, Eclipse, VS Code, or Antigravity IDE

### Compiling and Running Solutions

To compile and run any solution file locally:

```bash
# Example: Running Week 4 Transpose Matrix
cd Week-4/0867-transpose-matrix
javac solution.java
java Solution
```

---

<div align="center">

*Maintained with ❤️ for Problem Solving and Testing (S2-2).*

</div>