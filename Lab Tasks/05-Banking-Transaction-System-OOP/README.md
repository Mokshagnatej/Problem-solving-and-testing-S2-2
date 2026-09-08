# Experiment 5: Banking Transaction System Using Object-Oriented Programming

Models a simple bank account with deposit and withdraw operations, processing a sequence of transactions and printing the final balance.

## How to Run
```bash
javac Task5.java
java Task5
```

## Input Format
```
N
Deposit amount
Withdraw amount
... (N lines total)
```

## Approach
Encapsulates balance and operations inside a `BankAccount` class (private state, public `deposit`/`withdraw`/`getBalance` methods), demonstrating basic OOP encapsulation.

> **Note:** The original file had two bugs — the public class was named `Main` instead of `Task5` (filenames must match the public class in Java), and `main()` referenced an undefined `BankAccount` class while the actual balance logic lived in a class named `Task5`. Both are fixed here: the balance logic is in `BankAccount`, and the public entry-point class is `Task5`.
