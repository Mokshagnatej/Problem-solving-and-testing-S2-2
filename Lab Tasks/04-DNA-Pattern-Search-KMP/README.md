# Experiment 4: Intelligent DNA Pattern Search System Using KMP Algorithm

Searches for all occurrences of a pattern (e.g., a DNA subsequence) within a text using the Knuth-Morris-Pratt (KMP) algorithm, printing all starting indices of matches.

## How to Run
```bash
javac Task4.java
java Task4
```

## Input Format
```
text
pattern
```

## Approach
Builds the Longest Prefix Suffix (LPS) array for the pattern, then scans the text in O(n + m) time, using the LPS array to avoid re-scanning matched characters on a mismatch.
