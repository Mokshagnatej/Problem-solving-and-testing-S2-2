# Experiment 1: Salary Transformation System Using Functional Programming Techniques

Reads a list of employee salaries and applies a 10% raise to each, using Java Streams (functional programming style).

## How to Run
```bash
javac Task1.java
java Task1
```

## Input Format
```
N
salary_1 salary_2 ... salary_N
```

## Approach
Uses `Stream.map()` to transform each salary and `forEach()` to print the results, avoiding explicit loops.
