# Experiment 3: Maximum Profit Analyzer Using Kadane's Algorithm

Finds the maximum subarray sum (e.g., maximum possible profit from a sequence of values) in O(n) time using Kadane's Algorithm.

## How to Run
```bash
javac Task3.java
java Task3
```

## Input Format
```
n
value_1 value_2 ... value_n
```

## Approach
Tracks a running `currentSum` (best sum ending at the current index) and a `maxSum` seen so far, updating both in a single linear pass.
