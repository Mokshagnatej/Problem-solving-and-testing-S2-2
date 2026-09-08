# Experiment 2: Real-Time Stream Analytics Engine Using Stream Processing Concepts

Simulates sensor readings (ID + temperature), filters out readings ≤ 50, computes the average temperature per sensor, and prints results sorted by average temperature (descending).

## How to Run
```bash
javac Task2.java
java Task2
```

## Input Format
```
n
id_1 temp_1
id_2 temp_2
...
```

## Approach
Groups readings by sensor ID with `computeIfAbsent`, then uses the Stream API to map each group to an average and sort the results.
