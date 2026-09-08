# Experiment 6: Ride Sharing Platform Simulator Using OOP and Polymorphism

Simulates ride bookings across different vehicle types (Bike, Auto, Cab), each with its own fare calculation, using an abstract `Vehicle` class and a custom checked exception for invalid bookings.

## How to Run
```bash
javac Task6.java
java Task6
```

## Input Format
```
n
type_1 distance_1
type_2 distance_2
... (n lines total)
```
`type` is one of `Bike`, `Auto`, or `Cab`; `distance` must be a positive integer.

## Approach
- `Vehicle` is an abstract class with an abstract `calculateFare()` method, overridden differently by `Bike`, `Auto`, and `Cab` (runtime polymorphism).
- `Trip` validates the booking in its constructor and throws a custom `InvalidBookingException` for non-positive distances or unrecognized vehicle types.
