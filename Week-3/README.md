# 🚀 Week 3: Java Utilities, Collections, and Date/Time Processing

## 🎯 Overview
Welcome to Week 3! This week's focus is on mastering essential Java utilities and data structures, and applying them to solve algorithmic problems across LeetCode and HackerRank. The exercises build a strong foundation in handling dates, dynamic collections, and custom object sorting.

Key concepts covered include:
- The Java **Date and Time API** (`LocalDate`, `Calendar`, `ChronoUnit`)
- The Java **Collections Framework** (specifically `ArrayList` and `PriorityQueue`)
- Custom sorting mechanisms using the `Comparator` interface and `Collections.sort()`

---

## 💻 Directory Structure & Problem Breakdown

### LeetCode Challenges (Date and Time Focus)
These problems emphasize parsing and manipulating dates to extract specific information or calculate intervals.

| Problem | Difficulty | Description | Concepts Used | Solution |
| :--- | :---: | :--- | :--- | :---: |
| **[1154. Day of the Year](./day-of-the-year/)** | 🟢 Easy | Calculate exact day of the year from "YYYY-MM-DD" string, taking leap years into account. | String Parsing, Date Logic | [Java](./day-of-the-year/solution.java) |
| **[1185. Day of the Week](./day-of-the-week/)** | 🟢 Easy | Determine the day of the week (e.g., "Sunday", "Monday") for any date. | `java.time.LocalDate` | [Java](./day-of-the-week/solution.java) |
| **[1360. Number of Days Between Two Dates](./number-of-days-between-two-dates/)** | 🟢 Easy | Compute the absolute difference in days between two date strings. | `LocalDate`, `ChronoUnit` | [Java](./number-of-days-between-two-dates/solution.java) |

### HackerRank Challenges (Java Data Structures & Core Utilities)
These problems focus on practical implementation of Java's built-in data structures and object-oriented sorting techniques.

| Problem | Difficulty | Description | Concepts Used | Solution |
| :--- | :---: | :--- | :--- | :---: |
| **[Java ArrayList](./java-arraylist/)** | 🟡 Medium | Manage dynamic multidimensional lists and query coordinates with exception handling. | `ArrayList<ArrayList<Integer>>`, Exception Handling | [Java](./java-arraylist/solution.java) |
| **[Java Comparator](./java-comparator/)** | 🟡 Medium | Sort custom `Player` objects by score (descending) and name (ascending). | `Comparator` Interface, Custom Sorting | [Java](./java-comparator/solution.java) |
| **[Java Date and Time](./java-date-and-time/)** | 🟢 Easy | Return day of the week in uppercase for a given year, month, and day. | `java.time.LocalDate` / `Calendar` | [Java](./java-date-and-time/solution.java) |
| **[Java Priority Queue](./java-priority-queue/)** | 🟡 Medium | Process event streams to maintain prioritized queue of students by CGPA, name, ID. | `PriorityQueue`, Custom `Comparator` | [Java](./java-priority-queue/solution.java) |
| **[Java Sort](./java-sort/)** | 🟡 Medium | Sort student objects based on CGPA, name, and ID using Java collections sorting. | `Collections.sort()`, `Comparator` | [Java](./java-sort/solution.java) |

---

## 🌟 Key Takeaways
- **Robust Date Handling:** Gained practical experience utilizing modern Java time APIs (`java.time.LocalDate`) to simplify complex date calculations, replacing error-prone manual arithmetic.
- **Dynamic Collections:** Leveraged the flexibility of `ArrayList` over static arrays to handle arbitrary input sizes and dynamic datasets efficiently.
- **Custom Ordering & Priority:** Mastered the `Comparator` interface to define complex, multi-tiered sorting rules. Applied these rules to standard sorting algorithms and dynamic structures like `PriorityQueue`.
- **Exception Management:** Practiced safe data retrieval with `try-catch` blocks to gracefully handle queries outside the bounds of dynamic arrays.

---

<div align="center">

*Week 3 completed successfully!*

</div>
