# 🚀 Week 4: 2D Matrices, String Manipulation & Advanced Simulations

Welcome to **Week 4** of the Problem Solving and Testing journey! This week centers on multi-dimensional array processing, geometric matrix operations, string manipulation, and algorithmic simulations using **Java**.

---

## 🎯 Learning Objectives & Key Takeaways

- **Matrix Algebra & Coordinate Mapping:** Implemented core operations including matrix transposition ($O(R \cdot C)$), square matrix multiplication ($O(N^3)$), and primary/secondary diagonal difference computation.
- **2D Bounded Window Summation:** Solved subgrid accumulation queries with boundary clamping for matrix block sums.
- **Concentric Layer Rotation (Advanced Simulation):** Mastered ring-layer decomposition of 2D grids, computing cycle lengths, applying modulo rotation shifts $r \pmod{\text{perimeter}}$, and reconstructing rotated grids in-place.
- **String Parsing & Set Intersections:** Efficiently validated string partitions, vowel counts, military time conversions, and shared character sets in $O(A+B)$ time.
- **In-Place Two-Pointer Partitioning:** Moved elements (zeros) in-place without auxiliary array allocations.

---

## 💻 Problems Solved & Implementations

### LeetCode Challenges

| Problem | Difficulty | Core Concept | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| **[217. Contains Duplicate](./0217-contains-duplicate/)** | 🟢 Easy | Hash Set / Map Lookup | $O(N)$ | $O(N)$ | [Java](./0217-contains-duplicate/solution.java) |
| **[283. Move Zeroes](./0283-move-zeroes/)** | 🟢 Easy | Two Pointers (In-place Swap) | $O(N)$ | $O(1)$ | [Java](./0283-move-zeroes/solution.java) |
| **[867. Transpose Matrix](./0867-transpose-matrix/)** | 🟢 Easy | 2D Array Index Swap ($M \times N \to N \times M$) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./0867-transpose-matrix/solution.java) |
| **[1314. Matrix Block Sum](./1314-matrix-block-sum/)** | 🟡 Medium | 2D Range Summation & Coordinate Clamping | $O(M \cdot N \cdot K^2)$ | $O(M \cdot N)$ | [Java](./1314-matrix-block-sum/solution.java) |
| **[1704. Determine if String Halves Are Alike](./1704-determine-if-string-halves-are-alike/)** | 🟢 Easy | String Halves & Set Vowel Counting | $O(N)$ | $O(1)$ | [Java](./1704-determine-if-string-halves-are-alike/solution.java) |

### HackerRank & GeeksforGeeks Challenges

| Problem | Platform | Difficulty | Core Concept | Solution |
| :--- | :---: | :---: | :--- | :---: |
| **[Compare the Triplets](./compare-the-triplets/)** | HackerRank | 🟢 Easy | Element-wise Score Accumulation | [Java](./compare-the-triplets/solution.java) |
| **[Diagonal Difference](./diagonal-difference/)** | HackerRank | 🟢 Easy | Primary & Secondary Diagonal Sums | [Java](./diagonal-difference/solution.java) |
| **[Matrix Layer Rotation](./matrix-rotation-algo/)** | HackerRank | 🔴 Hard | Concentric Ring Extraction & Modulo Shift | [Java](./matrix-rotation-algo/solution.java) |
| **[Multiply 2 Matrices](./multiply-2-matrices4144/)** | GeeksforGeeks | 🟢 Easy | Square Matrix Multiplication ($O(N^3)$) | [Java](./multiply-2-matrices4144/solution.java) |
| **[Time Conversion](./time-conversion/)** | HackerRank | 🟢 Easy | 12-Hour AM/PM to Military 24-Hour Time | [Java](./time-conversion/solution.java) |
| **[Two Strings](./two-strings/)** | HackerRank | 🟢 Easy | Character Set Intersection ($O(A+B)$) | [Java](./two-strings/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **11** |
| **Platforms** | LeetCode (5) · HackerRank (5) · GeeksforGeeks (1) |
| **Difficulty** | 🟢 Easy: 9 &nbsp;\|&nbsp; 🟡 Medium: 1 &nbsp;\|&nbsp; 🔴 Hard: 1 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 4 completed successfully!*

</div>
